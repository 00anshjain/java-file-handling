package filehandlingbasic.filehandlingbasic;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile_3 {
    public static void main(String[] args) {
        File myFile = new File("WriteInFile_1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                /*
                Practice makes you perfect.
                Keep learning, Keep coding!
                 */
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
