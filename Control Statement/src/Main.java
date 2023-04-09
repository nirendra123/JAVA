import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Age:");
        age= Input.nextInt();

//        if (age == 40) {
//            System.out.println("Buy a new House");
//        }
//        else if(age>=60){
//            System.out.println("Retired");
//        }
//        else{
//            System.out.println("Buy old house");
//        }

        switch(age){
            case 40:
                System.out.println("Buy new house");
                break;


            case 60:
                System.out.println("Retired");
                break;

            default:
                System.out.println(" Buy old house");
        }
   }
}