
import java.util.Scanner;
public class Main{
    public static  void main(String[] args){
        System.out.println("\n\n\n\t\tNuclear Reactor: JX00-XC-HB1\n\t\t\t\t\t\t-Japan\n\n\n\t\t\t1.What is the total number of employees?");
        System.out.print("\t\t\t--> ");
        Scanner Input=new Scanner(System.in);
        int nOfEmployee= Input.nextInt();
        Scanner obj=new Scanner(System.in);
        System.out.println("\t\t\t2.What is the name of supervisor?");
        System.out.print("\t\t\t--> ");
        String name= obj.nextLine();
        
        System.out.println("\t\t\t3.How many times the Nuclear waste is removed from the core?");
        System.out.print("\t\t\t--> ");
        int nuclearWaste=Input.nextInt();
        System.out.print(" \t\t\t    times\n");
        System.out.println("\t\t\t4.What is the total weight of the waste produced every 1 week?(in ton?)");
        System.out.print("\t\t\t--> ");
        double weight=Input.nextDouble();
        System.out.print(" \t\t\t    ton\n");
        System.out.println("\t\t\t5.Is Electric Moter being replaced every 18 days?\n\t\t\t Press y for yes and n for no");
        System.out.print("\t\t\t--> ");
        char yorN=Input.next().charAt(0);
        System.out.println("\t\t\t6.What is the core average temperature(celsius) of the Nuclear Reactor?");
        System.out.print("\t\t\t--> ");
        double temperature=Input.nextDouble();
        System.out.println("\n\n\t\tStatus Updated:\n\n\t\t\tTotal No. of Emplooyee: "+nOfEmployee);
        System.out.println("\t\t\tSupervisor Name: "+name);
        System.out.println("\t\t\tNo.of times Nuclear Waste removed: "+nuclearWaste);
        System.out.println("\t\t\tTotal weight of waste in 1 week: "+weight);
        System.out.println("\t\t\tElectric Moter replaced(18days: )"+yorN);
        System.out.println("\t\t\tCore Average Temp in celsius: "+temperature);
        System.out.println("\t\t\tcore Average Temp is Kelvin: "+(temperature+273.15));

 }
}