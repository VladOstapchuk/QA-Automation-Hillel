package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task3;

import java.util.*;

public class FindOcc {

    private List<String> wordlist = new ArrayList<>();
    private String wordToFind;


    //конструктрів немає, працює тільки дефолтний

    //це такий сетер, щоб можна було наповнювати ліст словами не одразу при створенні об'єкта
    public void addWordTolist(String newWord) {
        this.wordlist.add(newWord);
    }

    //гетер виключно щоб перевіряти чи додались в ліст слова з мейна
    public List<String> getWordlist() {
        return wordlist;
    }


    //метод нічого не повертає, так як з нбого просто виведемо в консоль
    public void findOccurance(List<String> wordlist) {

        //створюю мапу
        Map<String, Integer> wordmap = new HashMap<>();

        for (String string : wordlist) {

            //якщо в мапі вже є такий ключ, то збільшую велью на 1
            if (wordmap.containsKey(string)) {

                for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
                    // get key
                    String key = entry.getKey();
                    // get value
                    Integer value = entry.getValue();
                    if (key.equalsIgnoreCase(string)) {
                        wordmap.replace(string, entry.getValue(), (entry.getValue() + 1));
                    }

                }
                // інакше записую нове значення в мапу. Ключ присвоюю = 1
            } else wordmap.put(string, 1);


        }
        //створюю List, тому що за завданням виведення має [ ] і особливий формат
        List<String> printlist = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {

            printlist.add("{name: \"" + entry.getKey() + "\", occurrence: " + entry.getValue().toString()+"}");

        }
        System.out.println(printlist);

    }
}
