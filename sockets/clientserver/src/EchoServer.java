import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {

        int port = 6789;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean running = true;
        while (running) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from client.");

                EchoReader in = new EchoReader(clientSocket);
                EchoWriter out = new EchoWriter(clientSocket);

                String msg;
                while ((msg = in.readLine()) != null) {
                    out.println("Server: " + msg);
                }

                // Cleanup
                System.out.println("Closing connection with client.");
                out.close();
                in.close();
                clientSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
