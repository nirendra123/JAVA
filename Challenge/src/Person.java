public class Person {

    public String Name;
    public int Age;

    //
    //default construcror
//    Person(){
//        Name="Nirenda";
//        Age=20;
//    }

   // parameter constructor
    Person(String a,int b){
        Name=a;
        Age=b;
    }
    public void introduce(){
        System.out.print("Hi,My name is ");
        System.out.print(Name);
        System.out.print(" and i am ");
        System.out.print(Age);
        System.out.println("year old.");
    }


}
