import static java.lang.Thread.currentThread;

public class MyThread  implements Runnable{
    //by using Runnable interface


    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.setName("nirendra");
        AnotherThread anotherThread=new AnotherThread();

        anotherThread.start();
        thread.start();

    }

    @Override
    public void run() {

        for(int i=0;i<100;i++){

            System.out.println(currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}