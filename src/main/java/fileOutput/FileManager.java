package fileOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileManager {



    public void writeMenu(Filename filename, List<String> menuText) {

        try {
            Path menuOutput = Path.of("src/main/resources/menu" + filename.toString() + ".txt");
            Files.createFile(menuOutput);

            String currentTime = CurrentDateTime.currentDateTime();

            Files.writeString(menuOutput, currentTime + "\r\n", StandardOpenOption.APPEND);

            for (String s : menuText) {
                Files.writeString(menuOutput, s + "\r\n", StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
