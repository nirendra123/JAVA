
import java.util.Random;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                //Guess a number
                Scanner Input = new Scanner(System.in);
                Random random = new Random();
                //create random number between  1 and 10
                int Computer_Guess = random.nextInt(1, 10);
                int i = 0;
                while (i < 5) {
                    System.out.println("\n Enter your guess:");
                    int User_Guess = Input.nextInt();
                    //condition for right and wrong guess
                    if (User_Guess <= 10 && User_Guess >= 1) {



                        //if the number is equal to the computer
                        if (Computer_Guess == User_Guess) {
                            System.out.print("\n");
                            System.out.println(" Your guessed is correct!!!");
                            break;

                        }
                        //if the guess number is greater
                        else if (User_Guess >= Computer_Guess) {
                            System.out.print("\n");
                            System.out.printf("%d is too high,Please guess is Lower number.",User_Guess);




                        } else {
                            System.out.print("\n");
                            System.out.printf("%d is too low,Please guess Higher number.",User_Guess);





                        }
                        i++;
                    }
                    //if the guess number is smaller
                    else {
                        System.out.print("\n");
                        System.out.println("Sorry invalid guess ");
                        System.out.println("please enter valid guess 1 to 10");
                    }



                }
            }
        }