public class Shape {
     public int width;
   public  int height;
   public int a;
Shape(){
    //default constructor
        width=10;
        height=20;
    }
    Shape(int w,int h){
//        parameter constructor
        width=w;
        height=h;
    }
    public void area(){
        a=width*height;
        System.out.println("Area= "+a);
    }

}
