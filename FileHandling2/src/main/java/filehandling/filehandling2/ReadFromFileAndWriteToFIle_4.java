package filehandling.filehandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromFileAndWriteToFIle_4 {
    public static void main(String[] args) throws IOException {
        //Cannot use BufferedReader and BufferedWriter here
        //We will read and write byte by byte in file
        File inputFile = new File("sampleFile2.txt");
        File outputFile = new File("sampleFile3.txt");

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int c = 0;
        while ((c = fis.read()) != -1) {
            System.out.println((char) c);
            fos.write(c);
        }
        fos.close();
        fis.close();
    }
}
