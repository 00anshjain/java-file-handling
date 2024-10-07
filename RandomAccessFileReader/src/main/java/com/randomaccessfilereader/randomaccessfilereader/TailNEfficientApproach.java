package com.randomaccessfilereader.randomaccessfilereader;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailNEfficientApproach {
    public static List<String> tailReverse(File file, int n) throws IOException {
        List<String> result = new ArrayList<>();
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        long fileLength = file.length();
        long position = fileLength - 1;
        StringBuilder currentLine = new StringBuilder();
        while (position >= 0 && n > 0) {
            raf.seek(position);
            char c = (char) raf.readByte();
            if (c == '\n') {
                n--;
                result.add(currentLine.reverse().toString());
                currentLine = new StringBuilder();
            } else {
                currentLine.append(c);
            }
            position--;
        }
        if (currentLine.length() > 0 && n > 0) {
            result.add(currentLine.reverse().toString());
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = tailReverse(new File("sampleFile1.txt"), 5);
        lines.forEach(System.out::println);
    }
}
