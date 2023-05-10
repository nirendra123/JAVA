import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{


    public static void main(String[] args){

        System.out.println("Server");
        try {
            ServerSocket serverSocket =new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("A new client has connected");
        } catch (IOException e) {

            System.out.println("Cannot connect to client");
            throw new RuntimeException(e);
        }
    }
}