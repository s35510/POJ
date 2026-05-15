public interface Logger {
    void LogMessage(Severity severity, EventSource eventSource, String message);
}
