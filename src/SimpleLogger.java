import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    private static int sumLog = 0;

    public SimpleLogger() {
        sumLog++;
    }

    @Override
    public void log(String msg) {
        if (msg.toLowerCase().contains(" error")) {
            System.out.println("ERROR " + sumLog +
                    " [" + LocalDateTime.now() + "] <" + msg + ">\n");
        } else {
            System.out.println("INFO# " + sumLog +
                    " [" + LocalDateTime.now() + "] <" + msg + ">\n");
        }
    }
}
