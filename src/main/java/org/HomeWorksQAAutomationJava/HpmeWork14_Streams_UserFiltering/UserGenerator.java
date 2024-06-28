package org.HomeWorksQAAutomationJava.HpmeWork14_Streams_UserFiltering;

import java.util.Random;

public class UserGenerator {
    private static final String[] NAMES = {"John", "Trinity", "Alex", "Iren", "Richard", "Makaka"};
    private static final String[] EMAILS = {"spam@super.net", "bestbuy@deneg.net", "kupi@slona.com",
            "cia@usa.com", "only@you.net", null};
    private static final String[] GENDERS = {"Male", "Female"};

    //повертаємо юзера з рандомно заповненими полями
    public static User userGenerate() {
        Random random = new Random();
        String name = NAMES[random.nextInt(NAMES.length)];
        String email = EMAILS[random.nextInt(EMAILS.length)];
        String gender = GENDERS[random.nextInt(GENDERS.length)];
        int age = random.nextInt(100);

        return new User(name, age, email, gender);
    }
}
