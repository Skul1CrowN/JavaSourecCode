import java.util.Scanner;

public class Pro1_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.print("Enter today's day: ");
        int todayDay = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = scanner.nextInt();
        System.out.printf("Today is %s and the future day is %s",day[todayDay % 7],day[(todayDay + elapsedDay) % 7]);
        scanner.close();
    }
}