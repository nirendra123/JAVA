import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialize
        Student student=new Student("Nirendra",21,"Bachelor");
        FileOutputStream fileOutputStream=new FileOutputStream("StudentsDetail.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        objectOutputStream.close();
       fileOutputStream.close();

       //Deserialize
        FileInputStream fileInputStream=new FileInputStream("StudentsDetail.txt");

         ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
         Student student1=(Student)objectInputStream.readObject();
        System.out.println(student1.name+" "+student1.age+" "+student1.level);
        objectInputStream.close();
        fileInputStream.close();










    }
}