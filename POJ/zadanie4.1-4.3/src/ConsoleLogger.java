public class ConsoleLogger implements Logger {
    public Severity logLevel;

    public ConsoleLogger(Severity logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message) {
        System.out.println("[CONSOLE LOGGER] "
                + severity + " | "
                + eventSource + " | "
                + message);
    }
}