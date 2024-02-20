package java_base;

public class RandomArray {
    public static void main(String[] args) {

            int[] array = new int[10];
            int max = array[0];
            int min = array[0];
            double sum = 0;

            for (int i = 0; i < array.length; i++) {
                array[i] = ((int)(Math.random() * 50) - 1);
                System.out.println(array[i]);
                sum += array[i];
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            double avg =  sum / array.length;

            System.out.println("Максимальное значение: " + max + ", минимальное значение: " + min + ", среднее значение: " + avg);

        }

    }
