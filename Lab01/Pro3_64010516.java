import java.util.Scanner;

public class Pro3_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0 || number >= 1000) {
            System.out.println("Input number is out of range!");
        } else {
            System.out.println("The sum of the digits is " + (number / 100 + (number % 100) / 10 + (number % 10)));
        }
    }
}
