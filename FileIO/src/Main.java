import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Nirendra.txt");

        //this will create new file
        file.createNewFile();


        //write kin the file
        FileWriter fileWriter = new FileWriter("Nirendra.txt");
        fileWriter.write("hey i am nirendra");
        fileWriter.close();


        FileReader fileReader = new FileReader("Nirendra.txt");
        int value;
        while ((value = fileReader.read()) != -1) {

            System.out.print((char) value);


        }
        fileReader.close();


        file.delete();

    }
}

