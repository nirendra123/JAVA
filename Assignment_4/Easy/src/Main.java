import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n1.Multiplication Table\n2.Currency Converter(Nepali to USD)\n3.Fibonacci Series\n\n");
        System.out.print("Enter a choice: ");
        int choice= scan.nextInt();
        switch(choice) {

            //Take input for multiplication table

            case 1:  System.out.print("Enter the Number for Multiplication Table: ");
            int n = scan.nextInt();
            Easy.multiplicationTable(n);
            break;

            //Convert Nepali Rupees to USD

            case 2 :System.out.print("Enter Nepalese Rupees: ");
            double nepaliRupees = scan.nextDouble();
            double usd = Easy.currencyConverter(nepaliRupees);
            System.out.println("USD= " + usd);
            break;


            // Fibonacci Series upto n numbers
            case 3:System.out.println("Enter the n number for Fibonacci Series: ");
            int j = scan.nextInt();
            Easy.fibonacciSeries(j);
            break;
            default:
            System.out.println("Wrong Input");
        }




    }
}