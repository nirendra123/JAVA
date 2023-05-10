import java.io.IOException;
import java.net.Socket;

public class Client {

public static void main (String[] args)
{
    System.out.println("Clients");
    try {
        Socket socket =new Socket("localhost",12345);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}
}

