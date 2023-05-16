import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\JAVA\\file\\filepractice.txt"));
       
      int ch ;
        while ((ch= bufferedReader.read())!=-1){

            System.out.print((char)ch);
        }
        bufferedReader.close();
    }
}