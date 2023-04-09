import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //object Serialization
        //Deserialization
        FileOutputStream fileOutputStream=new FileOutputStream("Nirendra.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Person person =new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream=new FileInputStream("Nirendra.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Person person1=(Person) objectInputStream.readObject();
        System.out.println(person1.getName());
        System.out.println( person1.getAge());

    }
}