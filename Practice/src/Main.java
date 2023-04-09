import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Triangle triangle=new Triangle(3,4,5);
       triangle.AreaAndPerimeter();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter three number for Average: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        Average average=new Average(a,b,c);
        average.avg();

        Student student=new Student("John",2);
    }
}