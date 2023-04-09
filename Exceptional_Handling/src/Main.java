public class Main {
    public static void main(String[] args) {
    try {
        int divider = 0;
        int value = 100;
//        if (divider==0){
//            throw new Exception();
//        }
        int result = value / divider;
        System.out.println("Result is:" + result);

    }catch (Exception e){
        System.out.println("error occur"+ e);

    } finally {
        System.out.println("finally block");

    }
        anotherWork();
    }
    static void anotherWork(){
        System.out.println("AnoherWork");


    }
}