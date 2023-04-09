import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {
       //buffer reader
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",N,i,N*i);
            System.out.print("\n");
        }
    }
}