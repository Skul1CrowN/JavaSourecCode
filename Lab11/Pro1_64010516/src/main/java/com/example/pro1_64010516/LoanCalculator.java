package com.example.pro1_64010516;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Text errorText = new Text("");

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 1, 1);
        gridPane.add(tfAnnualInterestRate, 2, 1);
        gridPane.add(new Label("Number of Years:"), 1, 2);
        gridPane.add(tfNumberOfYears, 2, 2);
        gridPane.add(new Label("Loan Amount:"), 1, 3);
        gridPane.add(tfLoanAmount, 2, 3);
        gridPane.add(new Label("Monthly Payment:"), 1, 4);
        gridPane.add(tfMonthlyPayment, 2, 4);
        gridPane.add(new Label("Total Payment:"), 1, 5);
        gridPane.add(tfTotalPayment, 2, 5);
        gridPane.add(btSave, 0, 6);
        gridPane.add(btLoad, 1, 6);
        gridPane.add(btClear, 2, 6);
        gridPane.add(btCalculate, 3, 6);
        gridPane.add(errorText,1,0);

        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btSave, HPos.LEFT);
        GridPane.setHalignment(btLoad, HPos.LEFT);
        GridPane.setHalignment(btClear, HPos.RIGHT);
        GridPane.setHalignment(btCalculate, HPos.LEFT);
        GridPane.setHalignment(errorText, HPos.CENTER);

        btCalculate.setOnAction(e -> calculateLoanPayment());
        btClear.setOnAction(e -> clearTextField());
        btSave.setOnAction(e -> {
            try {
                saveData();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        btLoad.setOnAction(e -> {
            try {
                loadData();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        Scene scene = new Scene(gridPane, 450, 250);
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }

    private void loadData(){
        try {
            FileInputStream fis = new FileInputStream("loan.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Loan loan = (Loan) ois.readObject();
            tfAnnualInterestRate.setText(Double.toString(loan.getAnnualInterestRate()));
            tfNumberOfYears.setText(Integer.toString(loan.getNumberOfYears()));
            tfLoanAmount.setText(Double.toString(loan.getLoanAmount()));
        } catch (Exception ex) {
            System.out.println("Cannot load file");
        }
    }

    private void saveData() {
        Loan loan = new Loan(Double.parseDouble(tfAnnualInterestRate.getText()), Integer.parseInt(tfNumberOfYears.getText()), Double.parseDouble(tfLoanAmount.getText()));
        try {
            FileOutputStream fos = new FileOutputStream("loan.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(loan);
        } catch (Exception ex){
            System.out.println("Cannot save file");
        }
    }

    private void clearTextField() {
        tfAnnualInterestRate.clear();
        tfNumberOfYears.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfTotalPayment.clear();
        errorText.setText("");
    }

    private void calculateLoanPayment() {
        try {
            double interest = Double.parseDouble(tfAnnualInterestRate.getText());
            int year = Integer.parseInt(tfNumberOfYears.getText());
            double loanAmount = Double.parseDouble(tfLoanAmount.getText());
            Loan loan = new Loan(interest, year, loanAmount);
            tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
            tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
            errorText.setText("");
        } catch (Exception ex) {
            errorText.setText("Please input only number!");
            errorText.setFill(Color.RED);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}