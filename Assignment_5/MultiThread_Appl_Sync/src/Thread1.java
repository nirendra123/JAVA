import java.io.IOException;

public class Thread1 extends Thread{
   ImportantFile file1;



            Thread1(ImportantFile file1){
                this.file1=file1;
            }

    @Override
    public void run() {
        try {
            file1.fun();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}



