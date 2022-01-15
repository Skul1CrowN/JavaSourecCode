import java.util.Scanner;

public class Pro3_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, date;
        System.out.print("Enter year: (e.g., 2022): ");
        year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        month = scanner.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        date = scanner.nextInt();
        scanner.close();
        int q = date;
        int m;
        //January = 13 and February = 14 in previous year
        if (month < 3) {
            m = month + 12;
            year--;
        } else {
            m = month;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        String[] day = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        System.out.printf("Day of the week is %s", day[h]);
    }
}
