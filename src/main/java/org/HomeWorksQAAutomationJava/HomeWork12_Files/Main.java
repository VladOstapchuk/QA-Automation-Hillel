package org.HomeWorksQAAutomationJava.HomeWork12_Files;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputPath;
        String outputPath;

        FileProcessor process1 = new FileProcessor("log.txt", "report.txt");
        FileProcessor process2 = new FileProcessor();

        //test for process1
        System.out.println("Process 1 results:");
        try {
            process1.Read("log1.txt");
            process1.Write("report1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //test for process2 - entering Path from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter path and name for input File: ");
        inputPath = scanner.nextLine();
        System.out.println("Please enter path and name for output File: ");
        outputPath = scanner.nextLine();
        System.out.println("Process 2 results:");
        try {
            process2.Read(inputPath);
            process2.Write(outputPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
