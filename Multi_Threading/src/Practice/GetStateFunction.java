package Practice;

public class GetStateFunction implements Runnable{

    @Override
    public void run() {
        Thread.State state= Thread.currentThread().getState();
        System.out.println("Running State Name: "+ Thread.currentThread().getName());
        System.out.println( "State of thread: "+ state);
    }

    public static void main(String[] args) {

        GetStateFunction obj=new GetStateFunction();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();
        t2.start();

    }
}
