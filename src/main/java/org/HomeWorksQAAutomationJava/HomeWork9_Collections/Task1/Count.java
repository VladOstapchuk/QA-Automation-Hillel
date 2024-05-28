package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {

    private List<String> wordlist = new ArrayList<>();
    private String wordToFind;

    //конструктрів немає, працює тільки дефолтний


    //гетер виключно щоб перевіряти чи додались в ліст слова з мейна
    public List<String> getWordlist() {
        return wordlist;
    }


    public int countOccurance(List<String> wordlist, String word) {
        int count = 0;
        for (String string : wordlist) {
            if (string.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }




}
