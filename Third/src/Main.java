import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a= in.nextInt();
            int b =in.nextInt();
            int n=in.nextInt();
           int result=result+(a+((int)(Math.pow(2.0,k)*b)));
            int result=0;
            for(int j=0;j<n;j++){
                double k=j;
//                System.out.printf("(%d+%d.%d)");
//                for(int k=0;k<(j+1);k++) {
//
//                    System.out.printf("%d+",a,b);
//
//                }
                System.out.printf("= %d",result);
                System.out.print("\n");
            }
        }
        in.close();

    }
}