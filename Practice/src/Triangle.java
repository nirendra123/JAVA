public class Triangle {
    public double height;
    public double perpendicular;
    public double base;
    Triangle(double h,double p,double b){
        height=h;
        perpendicular=p;
        base=b;
    }
    public void AreaAndPerimeter(){
        double area;
        area=(base*height)/2;
        System.out.println("Area of Triangle is : "+area);
        double perimeter=height+base+perpendicular;
        System.out.println("Perimeter of Triangle is: "+perimeter);
    }







}
