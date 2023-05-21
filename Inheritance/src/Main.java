
public class Main {
    public static void main(String[] args) {
        //extend from calc to AdvanceCalc is single level inheritance
        //extends from calc to AdvanceCalc and AdvanceCalc to MultiLevel inheriatance
       VeryAdvCalc calc=new VeryAdvCalc();
        int r1=calc.add(4,5);
        int r2= calc.sub(7,3);
        int r3=calc.multi(2,3);
        int r4=calc.div(6,2);
        int r5=calc.power(3,2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}