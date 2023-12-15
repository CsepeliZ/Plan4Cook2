package fileOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static String currentDateTime() {

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime currentTime = LocalDateTime.now();

        return currentTime.format(timeFormat);
    }


}