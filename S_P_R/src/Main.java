import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[] choice = {'S', 'P', 'R'};
        Scanner Input = new Scanner(System.in);

        //continue the game
        char Y = 'y';
        while (Y == 'y') {
            //take input from user S,P,R
            System.out.println("\n\n\t\t\tChoose Sissor,Paper,Rock(S,P,R): ");
            System.out.print("\t\t\t>> ");
            char user_Input = Input.next().charAt(0);
            user_Input = Character.toUpperCase(user_Input);

            //invalid input check
            if (user_Input == 'S' || user_Input == 'P' || user_Input == 'R') {
                //generate randomly S,P,R from computer
                Random random = new Random();
                int num = random.nextInt(3);
                char computer_Input = choice[num];
                System.out.println("\t\t\tComputer Input: " + computer_Input);

                //compute=user
                // result =draw
                if (computer_Input == user_Input) {
                    System.out.print("\t\t\tResult: ");
                    System.out.println("Draw");
                }
                //computer=S
                //user=R
                //user win
                //otherwise Lose
                else if (computer_Input == 'S' && user_Input == 'R') {
                    System.out.print("\t\t\tResult: ");
                    System.out.println("Congratulation,You Win!!!");

                }
                //computer=P
                //user=S
                //user win
                //otherwise Lose
                else if (computer_Input == 'P' && user_Input == 'S') {
                    System.out.print("\t\t\tResult: ");
                    System.out.println("Congratulation,You Win!!!");

                }

                //computer=R
                //user=P
                //user win
                //otherwise Lose
                else if (computer_Input == 'R' && user_Input == 'P') {
                    System.out.print("\t\t\tResult: ");
                    System.out.println("Congratulation,You Win!!!");

                }
                else {
                    System.out.print("\t\t\tResult: ");
                    System.out.println("Sorry,You Lose!!!");
                }
            }

            else{
                System.out.print("\t\t\tResult: ");
                    System.out.println("Invalid Input");
                }
                System.out.println("\t\t\tDo you want to play again(y for yes)?:");
            System.out.print("\t\t\t>> ");
                Y = Input.next().charAt(0);
                Y=Character.toLowerCase(Y);



<<<<<<< HEAD

=======
>>>>>>> origin/main
            }
        }
    }