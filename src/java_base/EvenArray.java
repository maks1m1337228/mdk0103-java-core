package java_base;

import java.util.stream.IntStream;

public class EvenArray {
    public static void main(String[] args) {

        int[] array = IntStream.rangeClosed(1, 20).toArray();


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
