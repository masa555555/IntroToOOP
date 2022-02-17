package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.println("I will add up the number you give me");
        while (i <= 5) {
            int number = sc.nextInt();
            System.out.println("Number: " + number);
            sum = number + sum;
            i++;
            System.out.println("The total so far is " + sum);
        }
        System.out.println("The total is " + sum);
        }
}
