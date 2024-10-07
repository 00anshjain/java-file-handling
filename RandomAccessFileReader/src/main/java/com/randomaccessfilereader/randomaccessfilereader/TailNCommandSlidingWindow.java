package com.randomaccessfilereader.randomaccessfilereader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TailNCommandSlidingWindow {
    public static List<String> tailSlidingWindow(File file, int n) {
        LinkedList<String> lastNLines = new LinkedList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (lastNLines.size() == n) {
                    lastNLines.removeFirst();  // Remove the oldest line
                }
                lastNLines.addLast(line);  // Add the new line
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(lastNLines);
    }

    public static void main(String[] args) {
        List<String> lines = tailSlidingWindow(new File("sampleFile1.txt"), 5);
        lines.forEach(System.out::println);
    }
}
