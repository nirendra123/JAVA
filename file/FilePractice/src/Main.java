import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //file practice
    public static void main(String[] args) throws IOException {

        Scanner scan=new Scanner(System.in);
        //extract metadata of file
        //File contain filepath
        File file=new File("C:\\Users\\Lenovo\\Desktop\\JAVA\\file\\filepractice1.txt");
        System.out.println("Is exits: "+file.exists());
        if(!file.exists()){
            file.createNewFile();
            System.out.println("Now file exist after file.createNewFile(); :"+file.exists());

        }

        System.out.println("can Write: "+file.canWrite());

        System.out.println("can Read: "+file.canRead());
        System.out.println("can Execute"+file.canExecute());
        System.out.println("Name of File: "+file.getName());
        System.out.println("Size of File: "+file.length());
        System.out.println("Do you want to delete file :");
        char ch=scan.next().charAt(0);
        if(ch=='y'||ch=='Y'){
            file.delete();
            System.out.println("File Deleted Successfully");
        }


    }
}