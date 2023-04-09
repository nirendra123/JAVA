import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=====================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //complete this line
            sc.nextLine();
            System.out.printf("%-15s%03d",s1,x);
        }
        System.out.println("\n");
        System.out.println("=====================");
    }
}