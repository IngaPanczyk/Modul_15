package patterns.singleton;

public class Logger {
    private static Logger loggerSettings = null;
    private String lastLog = "";

    private Logger (){
    }

    public static Logger getInstance() {
        if (loggerSettings == null) {
            loggerSettings = new Logger();
        }
        return loggerSettings;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
