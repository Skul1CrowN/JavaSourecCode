import java.util.Scanner;

public class Pro3_64010516 {
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }
    public static boolean checkDate(int year, int month, int day) {
        if(year <= 0)
            return false;
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && (day >= 1 && day <= 31)) {
            return true;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30)) {
            return true;
        } else if (month == 2) {
            if (leapYear(year) && (day >= 1 && day <= 29))
                return true;
            else if (!leapYear(year) && (day >= 1 && day <= 28))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2022): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = scanner.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = scanner.nextInt();
        scanner.close();
        if(!checkDate(year, month, day)){
            System.out.print("Invalid Input: Date is not exist.");
            System.exit(0);
        }
        int q = day;
        int m;
        if (month < 3) {
            m = month + 12;
            year--;
        } else {
            m = month;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j) % 7;
        String[] dayOfWeek = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.printf("Day of the week is %s",dayOfWeek[h]);
    }
}
