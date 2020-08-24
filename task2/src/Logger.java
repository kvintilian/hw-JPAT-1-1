import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;
    private static Logger logger;
    private final SimpleDateFormat formatForDateNow;

    private Logger() {
        formatForDateNow = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        Date dateNow = new Date();
        System.out.println("[" + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }
}
