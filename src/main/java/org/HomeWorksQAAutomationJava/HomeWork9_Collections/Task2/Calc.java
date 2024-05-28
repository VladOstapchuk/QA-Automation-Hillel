package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calc {

    private List<String> wordlist = new ArrayList<>();


    //конструктрів немає, працює тільки дефолтний


    //гетер виключно щоб перевіряти чи додались в ліст слова з мейна
    public List<String> getWordlist() {
        return wordlist;
    }


    public void calcOccurance(List<String> wordlist) {
        //створюю мапу
        Map<String, Integer> wordmap = new HashMap<>();

        //проходжу по кожній строці з листа
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
                // інакше записую нове значення в мапу. Велью присвоюю = 1
            } else wordmap.put(string, 1);

        }


        //Кожний елемент мапи за допомогою ForEach виводжу на консоль
        for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());


        }

    }

}
