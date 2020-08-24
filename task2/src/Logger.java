import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int num = 1;
    private static Logger logger;
    private final DateTimeFormatter formatForDateNow;

    private Logger() {
         formatForDateNow = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + formatForDateNow.format(LocalDateTime.now()) + " " + num++ + "] " + msg);
    }
}
