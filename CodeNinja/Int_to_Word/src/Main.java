
import java.util.* ;
import java.io.*;
public class Main {
    public static void main(String[] args) {



                //Write your code here\
        //three times input
                int T=3;
                int N;
                String s;
                Scanner scan= new Scanner(System.in);
              //  T=scan.nextInt();
                for(int i=1;i<=T;i++) {
                     N = scan.nextInt();
                    s= int_to_Words(N);
                    System.out.println(s);


                }



                }
    public static String int_to_Words(int N){
        int i;
        String[] str1=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] str2=new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] str3= new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] str4=new String[] {"","Hundred","Thousand","Lakh"};
        String s=Integer.toString(N);
        if(s.length()==1){
            return str1[N];
        } else if (s.length()==2) {
            if(N>=10||N<20) {
                i = N % 10;
                return str2[i];
            } else if (N>) {
                
            }
        } else if ()


        return s; }

        }

