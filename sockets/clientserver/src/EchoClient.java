import java.io.*;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {

        BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Client started.");
        Socket sock = null;
        try {
            sock = new Socket("localhost", 6789);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                System.out.println("Enter a string");
                String str = sysIn.readLine();

                // PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
                EchoWriter out = new EchoWriter(sock);
                out.println(str);

                EchoReader echoReader = new EchoReader(sock);
                System.out.println(echoReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
