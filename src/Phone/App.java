package Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        ArrayList<Phone> phonesArrayList = Phone.addPhones(30);

        Collections.sort(phonesArrayList, Comparator.comparingInt(Phone::getPrice).thenComparingInt(Phone::getWeight));


        System.out.println(phonesArrayList);
    }
}