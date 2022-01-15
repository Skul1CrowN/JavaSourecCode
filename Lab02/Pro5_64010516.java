import java.util.Scanner;

class Pro5_64010516 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= rows; i++) {
            //Print space
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            //Print first half of the row
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            //Print second half of the row
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}