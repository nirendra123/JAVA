import java.io.*;
import java.net.Socket;



public class Client {
    public static void main(String[] args) {

        System.out.println("client");

//         socket;

        {
            try {
                Socket socket = new Socket("172.25.20.196", 12345);

                BufferedReader socketDataReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //this is for user typed input
                BufferedReader userInputReader=new BufferedReader(new InputStreamReader(System.in));
                //i need a pen to write the message

                OutputStream outputStream=socket.getOutputStream();
                PrintWriter printWriter=new PrintWriter(outputStream);
                String sendingMessage,receivingMessage;
                while(true) {
                    //receiving message from client
                    receivingMessage=socketDataReader.readLine();
                    System.out.println("Server:"+receivingMessage);
                    //sending to client
                    sendingMessage= userInputReader.readLine();//get input from user
                    printWriter.println("Client :"+sendingMessage);
                    printWriter.flush();

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}