import java.util.Scanner;

public class Pro4_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = { "first", "second", "third" };
        String[] cityName = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the %s city: ", text[i]);
            cityName[i] = scanner.nextLine();
        }
        scanner.close();
        String temp;
        //Bubble Sort for cityname
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if(cityName[i].compareTo(cityName[j]) > 0) {
                    temp = cityName[i];
                    cityName[i] = cityName[j];
                    cityName[j] = temp;
                }
            }
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s",cityName[0],cityName[1],cityName[2]);
    }
}
