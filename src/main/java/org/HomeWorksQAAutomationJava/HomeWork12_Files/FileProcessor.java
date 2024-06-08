package org.HomeWorksQAAutomationJava.HomeWork12_Files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileProcessor {

    private String inputFilePath;
    private String outputFilePath;
    private Map<String, Integer> logCounts = new HashMap<>();

    public void setInputFilePath(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public void setOutputFilePath(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    //empty Constructor - only make the Map
    public FileProcessor() {
        logCounts.put("INFO", 0);
        logCounts.put("WARN", 0);
        logCounts.put("ERROR", 0);
    }

    //second variant - if want's create object already with all values
    public FileProcessor(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        logCounts.put("INFO", 0);
        logCounts.put("WARN", 0);
        logCounts.put("ERROR", 0);
    }

    //read from File to Map
    public void Read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith("[INFO]")) {
                logCounts.put("INFO", logCounts.get("INFO") + 1);
            } else if (line.startsWith("[WARN]")) {
                logCounts.put("WARN", logCounts.get("WARN") + 1);
            } else if (line.startsWith("[ERROR]")) {
                logCounts.put("ERROR", logCounts.get("ERROR") + 1);
            }
        }
        System.out.println("The Read method worked successfully");
    }

    //read from File to Map - method is overloaded by input String
    public void Read(String inputFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith("[INFO]")) {
                logCounts.put("INFO", logCounts.get("INFO") + 1);
            } else if (line.startsWith("[WARN]")) {
                logCounts.put("WARN", logCounts.get("WARN") + 1);
            } else if (line.startsWith("[ERROR]")) {
                logCounts.put("ERROR", logCounts.get("ERROR") + 1);
            }
        }
        System.out.println("The Read method worked successfully");
    }

    //write from Map to File
    public void Write() throws IOException {
        FileWriter writer = new FileWriter(outputFilePath);
        for (Map.Entry<String, Integer> entry : logCounts.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
        }
        writer.close();
        System.out.println("The Write method worked successfully");
    }

    //write from Map to File - method is overloaded by input String
    public void Write(String outputFilePath) throws IOException {
        FileWriter writer = new FileWriter(outputFilePath);
        for (Map.Entry<String, Integer> entry : logCounts.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
        }
        writer.close();
        System.out.println("The Write method worked successfully");
    }
}
