package filehandlingbasic.filehandlingbasic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile_2 {
    public static void main(String[] args) {
        File myFile = new File("WriteInFile_1.txt");
        try {
            FileWriter fileWriter = new FileWriter("WriteInFile_1.txt");
            fileWriter.write("Practice makes you perfect.\nKeep learning, Keep coding!");
            fileWriter.close();
            /*
            Practice makes you perfect.
Keep learning, Keep coding!
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
