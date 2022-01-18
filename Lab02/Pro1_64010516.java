import java.util.Scanner;

public class Pro1_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        System.out.print("Enter today's day: ");
        int inputDay = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayPast = scanner.nextInt();
        if (inputDay > 6 || inputDay < 0) {
            System.out.println("Invalid Input: Today's day must be 0-6.");
            error = true;
        }
        if (dayPast <= 0) {
            System.out.println("Invalid Input: Day(s) elapsed must be positive.");
            error = true;
        }
        if (error) {
            System.exit(0);
        }
        scanner.close();
        String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.printf("Today is %s and the future day is %s", dayOfWeek[inputDay],
                dayOfWeek[(inputDay + dayPast) % 7]);
    }
}
