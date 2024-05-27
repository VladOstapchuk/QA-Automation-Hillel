package org.HomeWorksQAAutomationJava.HomeWork9Collections.Exersise_1and2_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 1 Створити метод countOccurance, що приймає на вхід рядковий список як параметр
 і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись
  у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
*/
public class Count {

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

    public int countOccurance(String word) {
        int count = 0;
        for (String string : this.wordlist) {
            if (string.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }


    //вправа 2 ДЗ
    public void calcOccurance() {
        //створюю мапу
        Map<String, Integer> wordmap = new HashMap<>();

        //проходжу по кожній строці з листа
        for (String string : this.wordlist) {

            //якщо в мапі вже є такий ключ, то збільшую велью на 1
            if (wordmap.containsKey(string)) {

                for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
                    // get key
                    String key = entry.getKey();
                    // get value
                    Integer value = entry.getValue();
                        if (key.equalsIgnoreCase(string)){
                            wordmap.replace(string, entry.getValue(), (entry.getValue() + 1));
                        }

                }
                // інакше записую нове значення в мапу. Ключ присвоюю = 1
            } else wordmap.put(string, 1);

        }
        //виводжу мапу на друк
        for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());



        }
    }


}
