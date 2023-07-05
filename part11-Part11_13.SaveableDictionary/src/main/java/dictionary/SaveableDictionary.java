package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> mainDict;
    private String fileName;

    public SaveableDictionary() {
        this.mainDict = new HashMap<>();
        
    }
    
    public SaveableDictionary(String file) {
        this.mainDict = new HashMap<>();
        this.fileName = file;

    }

    public void add(String words, String translation) {
        if (!(mainDict.containsKey(words))) {
            this.mainDict.put(words, translation);

        }
    }

    public String translate(String word) {
        if(mainDict==null) {
            return null;
        }
        String result = mainDict.get(word);
        for (String loop : mainDict.keySet()) {
            if (mainDict.get(loop).equals(word)) {
                result = loop;
            }
        }
        return result;
    }

    public void delete(String word) {
        String temp = "";
        if (mainDict.containsKey(word)) {
            temp = word;
        } else {
            for (String loop : mainDict.keySet()) {
                if (mainDict.get(loop).equals(word)) {
                    temp = loop;
                }
            }
        }
        mainDict.remove(temp);
    }

    public boolean load() {
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            HashMap<String, String> tempMap = new HashMap<>();
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                tempMap.put(parts[0], parts[1]);
            }
            this.mainDict = tempMap;
            return true;

            
        } catch (IOException e) {
            System.out.println("File load errorror: " + e.getMessage());
        }
        return false;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.fileName);
            String toBeWritten = "";
            for(String loop: mainDict.keySet()) {
                toBeWritten = (loop + ":" + mainDict.get(loop));
                writer.println(toBeWritten);
                System.out.println(toBeWritten);
            }
            writer.close();

            return true;
        }
        catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    public void print() {
        for(String loop: mainDict.keySet()) {
            System.out.println(loop);
        }
    }
}
