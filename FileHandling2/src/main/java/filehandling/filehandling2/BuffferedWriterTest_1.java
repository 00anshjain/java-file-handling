package filehandling.filehandling2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuffferedWriterTest_1 {
    public static void main (String[] args) throws IOException {
        /*
        What will happen if we use FileWriter.write(s1) instead of BufferedWriter.write(s1)?
        Whenever we call fileWriter.write() method that many times write operation will be performed.
        Whereas Buffer writer doesn't directly write in file. It will keep adding data in buffer.
        When it feels buffer is enough loaded, then it performs write operation() or when we close bufferWriter() object then.
        So it reduces number of read write operation.
        So Buffer writer is useful when we have to write in file for each small input.
         */
        String path = "sampleFile2.txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello there");
        System.out.println("done");
        bw.close();// It will not be written in file by buffer writer untill we close it or memory is full.
        fw.close();//Maintain sequence of closing object. We cannot close it before BufferWriter object.
    }

}
