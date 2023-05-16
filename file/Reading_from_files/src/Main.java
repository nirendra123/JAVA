import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //reading form file means extracting data stored in the file without deleting it from the file
        //fileInputStream for reading strams of rawBytes
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\JAVA\\file\\filepractice.txt");
      byte i;
      do{
          i=(byte)fileInputStream.read();
          if(i!=-1){
              System.out.print((char)i);
          }

      }while(i!=-1);
      fileInputStream.close();
    }
}