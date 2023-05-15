import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message="Hello World";
        InetAddress address=InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address,12345);
        //sending packet via socket
        System.out.println( "sending message...");
        socket.send(packet);

    }
}