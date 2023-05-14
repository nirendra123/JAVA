import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
    public static void main(String[] args)  {
        try {
            ServerSocket serverSocket=new ServerSocket(12345);
            Socket socket=serverSocket.accept();
            System.out.println("A new client has  connected");
            //this is for gettingg scoket value(message)
            BufferedReader socketDataReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //this is for user typed input
            BufferedReader userInputReader=new BufferedReader(new InputStreamReader(System.in));
            //i need a pen to write the message
          OutputStream outputStream=socket.getOutputStream();
          PrintWriter printWriter=new PrintWriter(outputStream);
          String sendingMessage,receivingMessage;
          while(true) {
              //sending to client
             sendingMessage= userInputReader.readLine();//get input from user
              printWriter.println(sendingMessage);
              printWriter.flush();
              //receiving message from client
              receivingMessage=socketDataReader.readLine();
              System.out.println(receivingMessage);
          }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}