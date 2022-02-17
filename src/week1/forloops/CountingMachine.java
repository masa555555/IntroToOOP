package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Count to: " + number);
        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }

    }
}
