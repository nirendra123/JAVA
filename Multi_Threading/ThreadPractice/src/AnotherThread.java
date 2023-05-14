
public class AnotherThread extends Thread{

    @Override
    public void run() {
        super.run();
        setName("thread 2");
        
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