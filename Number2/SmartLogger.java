import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int countOfLog;

    @Override
    public void log(String msg) {
        countOfLog++;
        System.out.println((msg.toLowerCase().contains("error") ? "ERROR" : "INFO") + countOfLog + " " + LocalDateTime.now() + " " + msg);
    }

}
