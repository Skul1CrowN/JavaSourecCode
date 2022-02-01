import java.util.GregorianCalendar;

public class Pro2_64010516 {
    public static void main(String[] args) {
        GregorianCalendar gregolian = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gregolian.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gregolian.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gregolian.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gregolian.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("-------------------------------------------");
        gregolian.setTimeInMillis(gregolian.getTimeInMillis() + 86400000L);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gregolian.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gregolian.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gregolian.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gregolian.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gregolian.getTime());
    }
}
