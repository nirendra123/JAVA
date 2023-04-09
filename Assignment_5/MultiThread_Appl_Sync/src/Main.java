import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
ImportantFile obj=new ImportantFile();
Thread1 t1=new Thread1(obj);
Thread2 t2=new Thread2(obj);
t1.start();
t2.start();




    }
}
