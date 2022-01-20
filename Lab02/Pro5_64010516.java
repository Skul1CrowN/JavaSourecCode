import java.util.Scanner;

public class Pro5_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = scanner.nextInt();
        scanner.close();
        if(num < 1 || num > 15) {
            System.out.print("Invalid input: Number must be from 1-15");
            System.exit(0);
        }
        for (int i = 1; i <= num; i++) {
            //Print space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            //Print first half
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            //Print second half
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}