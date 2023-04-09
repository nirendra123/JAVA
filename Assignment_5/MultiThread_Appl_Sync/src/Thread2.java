import java.io.IOException;

public class Thread2 extends Thread{

    ImportantFile file2;
    Thread2(ImportantFile file2){
        this.file2=file2;
    }

    @Override
    public void run() {
        try {
            file2.fun();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
