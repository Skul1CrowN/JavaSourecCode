import java.util.Scanner;
import java.util.Random;

public class Pro2_64010516 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] stance = {"scissor","rock","paper"};
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = scanner.nextInt();
        int computer = rand.nextInt(3);
        scanner.close();
        //Draw
        if(player == computer)
        {
            System.out.printf("The computer is %s. You are %s too. It is a draw",stance[computer],stance[player]);
        }
        else
        {
            //Win
            if((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1))
                System.out.printf("The computer is %s. You are %s. You won",stance[computer],stance[player]);
            //Lost
            else
                System.out.printf("The computer is %s. You are %s. You lost",stance[computer],stance[player]);
        }
    }
}
