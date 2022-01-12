import java.util.Scanner;

public class Pro4_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height;
        System.out.print("Enter weight in pounds: ");
        weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        height = scanner.nextDouble();
        scanner.close();
        if (weight <= 0 || height <= 0) {
            System.out.println("Data inputs are invalid!");
        } else {
            System.out.printf("BMI is %.4f", (weight*0.45359237)/( (height*0.0254)*(height*0.0254) ));
        }
    }
}
