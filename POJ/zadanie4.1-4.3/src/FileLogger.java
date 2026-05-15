import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {
    public Severity logLevel;
    private String fileName;

    public FileLogger(Severity logLevel, String fileName) {
        this.logLevel = logLevel;
        this.fileName = fileName;
    }

    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));

            writer.println("[FILE LOGGER] "
                    + severity + " | "
                    + eventSource + " | "
                    + message);

            writer.close();
        } catch (IOException e) {
            System.out.println("Blad zapisu do pliku: " + e.getMessage());
        }
    }
}