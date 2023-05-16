import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       //buffer temporary storage
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\JAVA\\file\\filepractice.txt",true));
        bufferedWriter.write(" Bajracharya");
        bufferedWriter.close();
    }

}