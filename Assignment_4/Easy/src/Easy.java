<<<<<<< HEAD
import java.util.Scanner;

public class Easy {
   public static void multiplicationTable(int n) {
       for (int i = 1; i <= 10; i++) {
           System.out.println(n + " x " + i + " = " + n * i);
       }

   }
   public static double currencyConverter(double rupees){
       double convert=rupees/135.03;
       return convert;
       }



   public static void fibonacciSeries(int n){
       int a=0,b=1,sum;
       System.out.print(a+" "+b);
       for(int i=2;i<n;i++){
           sum=a+b;

           a=b;
           b=sum;
           if(sum>n){
               break;
           }
           System.out.print(" "+sum);

       }


   }


}
=======
import java.util.Scanner;

public class Easy {
   public static void multiplicationTable(int n) {
       for (int i = 1; i <= 10; i++) {
           System.out.println(n + " x " + i + " = " + n * i);
       }

   }
   public static double currencyConverter(double rupees){
       double convert=rupees/135.03;
       return convert;
       }



   public static void fibonacciSeries(int n){
       int a=0,b=1,sum;
       System.out.print(a+" "+b);
       for(int i=2;i<n;i++){
           sum=a+b;

           a=b;
           b=sum;
           if(sum>n){
               break;
           }
           System.out.print(" "+sum);

       }


   }


}
>>>>>>> origin/main
