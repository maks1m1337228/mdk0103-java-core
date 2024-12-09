package Collections;

import java.util.ArrayList;
import Collections.*;

public class App {
    public static void main(String[] args) {
        String statusToRemove = "LOW";
        ArrayList<Message> messageArrayList = new ArrayList<>();
        Message message = new Message("","","");
        message.generateMessage(messageArrayList);
        Message.printUnique(messageArrayList);
        Message.removeAllByStatus(messageArrayList, statusToRemove);

    }

}
