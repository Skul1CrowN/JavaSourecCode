import java.util.Scanner;

public class Pro4_64010516 {
    public static String[] sort(String[] str) {
        for(int i=0;i<str.length;i++) {
            for(int j=i+1;j<str.length;j++) {
                if(str[i].compareToIgnoreCase(str[j]) > 0) {
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cityName = new String[3];
        String[] text = {"fisrt","second","third"};
        for(int i=0;i<3;i++) {
            System.out.printf("Enter the %s city: ",text[i]);
            cityName[i] = scanner.nextLine();
        }
        scanner.close();
        cityName = sort(cityName);
        System.out.printf("The three cities in alphabetical order are %s %s %s",cityName[0],cityName[1],cityName[2]);
    }
}
