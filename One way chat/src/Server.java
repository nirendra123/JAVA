import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server{


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        try {
            ServerSocket serverSocket =new ServerSocket(1000);
           Socket socket=serverSocket.accept();
            System.out.println("A new client has connected");
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream,true);
            while (true) {
                String data = scanner.nextLine();

                System.out.println("Server");
                printWriter.println(data);

            }
        } catch (IOException e) {

            System.out.println("Cannot connect to client");
            throw new RuntimeException(e);
        }
    }
}