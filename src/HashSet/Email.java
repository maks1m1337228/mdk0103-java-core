package HashSet;

import Collections.Message;

import java.util.HashSet;

public class Email {
    public String userEmail;

    @Override
    public String toString() {
        return  userEmail;
    }

    public Email(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".");
    }

    public void addToHashSet(HashSet<Email> emails) {
        if (isValidEmail(this.userEmail)) {
            emails.add(this);
            System.out.println("электронная почта валидна");
        } else {
            System.out.println("некорректная электронная почта");

        }
    }

    public void printHashSet(HashSet<Email> emails) {
        System.out.println("\nсписок электронных почт: ");
        for (Email email: emails) {
            System.out.println(email);
        }
    }


}
