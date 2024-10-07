package filehandlingbasic.filehandlingbasic;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class CreateNewFile_1 {

    public static void main(String[] args) {
//  createNewFile() method is used to create a new file.
        File myFile = new File("fileCreation1.txt");
        try {
            myFile.createNewFile(); //return boolean value -> true / false
            System.out.println("File created successfully");
        } catch (IOException ex) {
            System.out.println("Exception while creating file : {}, ex");
        }
    }

}
