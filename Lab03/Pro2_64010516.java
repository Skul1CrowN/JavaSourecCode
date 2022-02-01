import java.util.Scanner;
import java.util.Arrays;

public class Pro2_64010516 {
    public static int[] merge(int[] list1, int[] list2) {
        int[] list = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            list[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            list[i + list1.length] = list2[i];
        }
        Arrays.sort(list);
        return list;
    }

    public static int[] input(String str) {
        String[] arr = str.split(" ");
        int[] list = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                list[i] = Integer.parseInt(arr[i]);
            } catch (Exception e) {
                System.out.println("Invalid Input: Input must be integer only.");
                System.exit(0);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter list2: ");
        String input2 = scanner.nextLine();
        if (input1 == "" || input2 == "") {
            System.out.println("Invalid Input: Input must have at least one integer.");
            System.exit(0);
        }
        scanner.close();
        int[] list1 = input(input1);
        int[] list2 = input(input2);
        int[] list = merge(list1, list2);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
}
