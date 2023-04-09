import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("Nirendra.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Hello\n");
        fileWriter.write("Hello\n");
        fileWriter.write("Hello\n");
        fileWriter.close();


        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        while(line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }

        fileReader.close();


    }
}