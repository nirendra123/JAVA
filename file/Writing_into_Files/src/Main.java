import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //for writing into a file we need to create object of fileoutputstream which point to the file
        //the change in secondary memory permanently we need to close fileoutputstream

        //Ram<-fileoutputStream -secondary memory
        //Ram->fileoutputstream.close(); ->secondary memory

        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\JAVA\\file\\filepractice.txt");
        String name="Nirendra";
        char[] n=name.toCharArray();
        for(int i=0;i<name.length();i++){
            fileOutputStream.write(n[i]);
        }
        fileOutputStream.close();

    }
}