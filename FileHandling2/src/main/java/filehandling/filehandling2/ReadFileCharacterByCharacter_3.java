package filehandling.filehandling2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharacterByCharacter_3 {
    public static void main(String[] args) throws IOException {
        String path = "sampleFile2.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int c;
        //br.read() == -1 -> END of FILE
        while ((c = br.read()) != -1) {
            System.out.println((char) c);
        }
        br.close();
        fr.close();
    }
}
