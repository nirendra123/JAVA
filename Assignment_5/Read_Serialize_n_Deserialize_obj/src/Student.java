import java.io.Serializable;

public class Student implements Serializable {
    String name=new String();
    int  age;
    String level=new String();


 public Student(String n, int a, String l){
     this.name=n;
     this.age=a;

     this.level=l;
 }

}
