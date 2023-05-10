import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        System.out.println("Clients");
        try {
            Socket socket = new Socket("localhost", 1000);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int c;
            while (true) {
                c = inputStreamReader.read();

                while (c != -1) {

                    System.out.print((char) c);
                    c = inputStreamReader.read();

                }
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}

