import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Vector
//"Arrays are like boxes of a fixed size, while Vectors are like expandable boxes that can grow or
//sink as Needed.
        int[] age={10,20,30};
        Vector age2=new Vector(3,10 );

        age2.add(10);
        age2.add(20);
        age2.add(30);
        age2.add(40);
        age2.add("Nirendra");
        age2.add(60);
        System.out.println("capacity:"+ age2.capacity());




    }
}