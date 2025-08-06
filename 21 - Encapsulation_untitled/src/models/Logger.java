package models;

public class Logger {
    private String logLevel;

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public void log(String message) {
        System.out.println("[" + logLevel + "]" + message);
    }
}

