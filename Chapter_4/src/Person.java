import java.io.Serializable;

public class Person implements Serializable {
    int age=21;
    String name="Nirendra Bajracharya";
    double height=4.11;
    String getName(){
        return name;
    }
    int getAge(){return age;}
}
