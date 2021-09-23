import java.net.Socket;
import java.util.ArrayList;

public class TurnstileClient implements Runnable {

    Socket socket;
    Writer writer;
    ArrayList<String> names;

    public TurnstileClient(Socket socket, Writer writer) {
        this.socket = socket;
        this.writer = writer;
        this.names = new ArrayList<>();
    }

    @Override
    public void run() {
        long randomTime = 100L + (long) (Math.random() + (500L - 100L));

        int nameSuffix = 0;
        boolean running = true;
        while (running) {
            try {
                Thread.sleep(randomTime);
                names.add(generateName(nameSuffix));

                System.out.printf("%s went through the turnstile at %s.\n",
                        names.get(nameSuffix), Thread.currentThread().getName());
                nameSuffix++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String generateName(int n) {
        return "Person " + n;
    }
}
