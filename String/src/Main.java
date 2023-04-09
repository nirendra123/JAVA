import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //flyweight pattern
        // this will create in string pool

//        String name="Nirendra ";
//        name=name+"bajracharya";
//
//        System.out.println(name);
        //point memory address and remove previous garbage value 
        //this will create the new Instance of the string
        String name2=new String ("Hello world");
        //string buffer=memory mutable=overwrite the data
        StringBuffer name3=new StringBuffer("Nirendra");
        name3.append("bajrachrya");
        System.out.println(name3);
    }
}
