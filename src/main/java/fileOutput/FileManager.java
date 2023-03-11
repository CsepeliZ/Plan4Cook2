package fileOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManager {


    public void writeMenu(Filename filename, List<String> menuText) {

        try {
            Path menuOutput = Path.of("src/main/resources/menu" + filename.toString() + ".txt");
            Files.createFile(menuOutput);
            for (String s : menuText) {
                Files.writeString(menuOutput, s + "\r\n", StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
