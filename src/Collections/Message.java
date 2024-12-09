package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Message {
    public String status;
    public String code;
    public String text;


    public Message(String status, String code, String text) {
        this.status = status;
        this.code = code;
        this.text = text;
    }

    public void generateMessage(ArrayList<Message> messagesArrayList) {
        Random random = new Random();
        int count = 20;

        for (int i = 0; i < count; i++) {
            String status = MessagesData.statuses[random.nextInt(MessagesData.statuses.length)];
            String code = MessagesData.codes[random.nextInt(MessagesData.codes.length)];
            String text = MessagesData.texts[random.nextInt(MessagesData.texts.length)];
            messagesArrayList.add(new Message(status, code, text));
        }

    }

    @Override
    public String toString() {
        return "Статус: '" + status + '\'' +
                ", Код: ='" + code + '\'' +
                ", Текст: ='" + text + '\'';
    }

    public static void printUnique(ArrayList<Message> messagesArrayList) {
        java.util.LinkedHashSet<Message> uniqueMessages = new java.util.LinkedHashSet<>(messagesArrayList);

        for (Message message : uniqueMessages) {
            System.out.println(message);
        }

    }
    
    public static void printArray(ArrayList<Message> messageArrayList) {
        for (Message message: messageArrayList) {
            System.out.println(message);
        }
        
    }

    public static void removeByStatus(ArrayList<Message> messageArrayList, String statusToRemove) {
        System.out.println("Список до: ");
        Iterator<Message> iterator = messageArrayList.iterator();
        while (iterator.hasNext()) {
            Message message = iterator.next();
            if (message.status != null && message.status.equals(statusToRemove)) { // Проверка на null и использование equals()
                iterator.remove();
            }
        }
        System.out.println("Список после: ");
        printArray(messageArrayList);
    }

    public static void removeAllByStatus(ArrayList<Message> messageArrayList, String statusToRemove) {
        System.out.println("Список до: ");
        printArray(messageArrayList);
        Iterator<Message> iterator = messageArrayList.iterator();
        while (iterator.hasNext()) {
            Message message = iterator.next();
            if (message.status == null || !message.status.equals(statusToRemove)) {
                iterator.remove();
            }
        }
        System.out.println("Список после: ");
        printArray(messageArrayList);
    }
}
