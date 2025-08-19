package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private String logfileName;

    public Logger(String logfileName) {
        this.logfileName = logfileName;
    }

    public void log(String logText) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logfileName, true))) {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm:ss");
            String dateTime = localDateTime.format(formatter);
            writer.write(dateTime + " - " + logText);
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Ошибка записи лога в файл");
        }
    }
}
