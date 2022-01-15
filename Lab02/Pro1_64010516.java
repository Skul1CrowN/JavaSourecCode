import java.util.Scanner;

public class Pro1_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int inputDay = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayPast = scanner.nextInt();
        scanner.close();
        String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.printf("Today is %s and the future day is %s",dayOfWeek[inputDay%7],dayOfWeek[(inputDay+dayPast)%7]);
    }
}
