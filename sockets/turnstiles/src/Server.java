import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server {

    private CopyOnWriteArrayList<TurnstileClient> turnstileClients;
    private Thread[] turnstileThreads = new Thread[Constants.NUM_TURNSTILES];

    public Server() {
        this.turnstileClients = new CopyOnWriteArrayList<>();
    }

    public void serve() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(Constants.PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < Constants.NUM_TURNSTILES; i++) {
            System.out.println("hi");
            try {
                System.out.println(2);
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from client.");

                System.out.println(3);
                Reader in = new Reader(clientSocket);
                Writer out = new Writer(clientSocket);

                System.out.println(4);
                TurnstileClient client = new TurnstileClient(clientSocket, out);
                turnstileThreads[i] = new Thread(client);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        for (Thread t : turnstileThreads) {
            System.out.println("Starting thread " + t.getName());
            t.start();
        }

        boolean running = true;
        while (running) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from client.");

                Reader in = new Reader(clientSocket);
                Writer out = new Writer(clientSocket);

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
