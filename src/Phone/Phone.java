package Phone;

import java.util.ArrayList;
import java.util.Random;

    public class Phone {
        public int serialNumber;
        public String model;
        public int weight;
        public int price;

        public Phone(int serialNumber, String model, int weight, int price) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.weight = weight;
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "serialNumber=" + serialNumber +
                    ", model='" + model + '\'' +
                    ", weight=" + weight +
                    ", price=" + price +
                    '}';
        }

        public static ArrayList<Phone> addPhones(int count) {
            ArrayList<Phone> phones = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int serialNumber = 300 + i;
                String model = "Iphone";
                int weight = random.nextInt(300, 520);
                int price = random.nextInt(25000, 60000);
                phones.add(new Phone(serialNumber, model, weight, price));
            }
            return phones;
        }
    }

