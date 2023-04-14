import java.io.*;

public class ImportantFile {
    synchronized public void fun() throws IOException {
        GUI gui=new GUI();
        File file = new File("Nirendra.txt");

        //this will create new file
       // file.createNewFile();


        //write kin the file
        //Nirendra.txt exit
//        FileWriter fileWriter = new FileWriter("Nirendra.txt");
//        fileWriter.write("hey, i am nirendra.");
//        fileWriter.close();


        FileReader fileReader = new FileReader("Nirendra.txt");
        int value;
        while ((value = fileReader.read()) != -1) {

            System.out.print((char) value);

            try{

                Thread.sleep(200);

            }catch (Exception e){
                e.printStackTrace();
            }


        }
        fileReader.close();
    }
}
