import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoWriter {

    PrintWriter out;

    public EchoWriter(Socket socket) {
        try {
            this.out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(String line) {
        this.out.println(line);
    }

    public void close() {
        this.out.close();
    }
}
