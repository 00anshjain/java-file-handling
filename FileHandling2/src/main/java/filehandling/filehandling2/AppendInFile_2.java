package filehandling.filehandling2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInFile_2 {
    public static void main (String[] args) throws IOException {
        /*
            Concepts:
            FileWriter has two constructors:
            FileWriter(File file)
            FileWriter(File file, boolean append)
         */
        String path = "sampleFile2.txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file, true);     //append = true
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello there append check");
        System.out.println("done");
        bw.close();// It will not be written in file by buffer writer untill we close it or memory is full.
        fw.close();//Maintain sequence of closing object. We cannot close it before BufferWriter object.
    }
}
