package org.HomeWorksQAAutomationJava.HpmeWork14_Streams_UserFiltering;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //компаратор для сортування за іменем
        Comparator<User> usersNameComparator = (u1, u2) -> u1.getName().compareTo(u2.getName());

        //створюю безкінечний потік юзерів
        Stream<User> generate = Stream.generate(UserGenerator::userGenerate);

        //зберігаю відфільтрований стрим(щоб зручніше було читати код)
        Stream<User> filteredStream = generate
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(usersNameComparator)
                .filter(user -> user.getEmail() != null);

        // Групую за гендером
        Map<String, List<User>> groupedByGender = filteredStream.collect(Collectors.groupingBy(User::getGender));

        // Вивожу результат з фігурними дужками {} - саме жахливе завдання
        System.out.print("{");
        String result = groupedByGender.entrySet().stream()
                .map(entry -> entry.getKey() + "={" + entry.getValue().stream()
                        .map(User::getName)
                        .collect(Collectors.joining(", ")) + "}")
                .collect(Collectors.joining(", "));
        System.out.println(result + "}");
    }
}

