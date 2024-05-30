package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task3;

import java.util.*;

public class FindOcc {

    private List<String> wordlist = new ArrayList<>();

    //конструктрів немає, працює тільки дефолтний



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

        int i = wordmap.size();// Змінна для відстеження останнього елемента

        for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {

            if (i>=(wordmap.size()-1)){

                //надаю потрібний формат і записую в List
                printlist.add("\n"+"{name: \"" + entry.getKey() + "\", occurrence: " + entry.getValue().toString()+"}");
                i--;
            }
            else {
                //надаю потрібний формат і записую в List
                printlist.add("\n"+"{name: \"" + entry.getKey() + "\", occurrence: " + entry.getValue().toString()+"}"+"\n");

            }


        }

         System.out.println(printlist);

    }
}
