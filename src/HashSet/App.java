package HashSet;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Email email = new Email("228666@gmail.com");
        Email email2 = new Email("1337@gmail.com");

        HashSet<Email> emails = new HashSet<>();

        email.addToHashSet(emails);
        email2.addToHashSet(emails);

        email.printHashSet(emails);



    }
}
