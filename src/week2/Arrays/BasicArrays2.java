package week2.Arrays;
import java.util.Random;


public class BasicArrays2 {
    public static void main(String[] args) {
        int [] array = new int [100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Slot " + (i) + " contains a " + array[i] + " ");

        }
    }
}
