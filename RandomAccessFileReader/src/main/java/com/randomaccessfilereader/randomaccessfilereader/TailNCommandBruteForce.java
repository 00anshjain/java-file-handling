package com.randomaccessfilereader.randomaccessfilereader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TailNCommandBruteForce {
    public static List<String> tailBruteForce(File file, int n) {
        List<String> allLines = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                allLines.add(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines.subList(Math.max(allLines.size() - n, 0), allLines.size());
    }

    public static void main(String[] args) {
        List<String> lines = tailBruteForce(new File("sampleFile1.txt"), 5);
        lines.forEach(System.out::println);
    }
}
