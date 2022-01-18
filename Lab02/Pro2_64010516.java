import java.util.Scanner;

public class Pro2_64010516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stance = {"scissor","rock","paper"};
        System.out.print("scissor (0), rock (1), paper(2): ");
        int playerStance = scanner.nextInt();
        int computerStance = (int)(Math.random() * 3);
        if(playerStance < 0 || playerStance > 2){
            System.out.println("Invalid input: Enter only number 0, 1, 2.");
            System.exit(0);
        }
        scanner.close();
        //Draw
        if(playerStance == computerStance) {
            System.out.printf("The computer is %s. You are %s too. It is draw",stance[computerStance],stance[playerStance]);
        }
        else {
            System.out.printf("The computer is %s. You are %s.",stance[computerStance],stance[playerStance]);
            //0 = scissor 1 = rock 2 = paper
            //Won
            if((playerStance == 0 && computerStance == 2) || (playerStance == 1 && computerStance == 0) || (playerStance == 2 && computerStance == 1)) {
                System.out.print(" You won");
            }
            //Lost
            else {
                System.out.print(" You lost");
            }
        }
    }
}
