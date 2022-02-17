package week1.keyboardinput;

import java.util.Scanner;
public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What your name? ");
        String name = sc.nextLine();
        System.out.println("HI " + name + "! How old are you?");
        int year = sc.nextInt();
        System.out.println("Did you know that in five years you will be " + (year + 5) + " years old");
        System.out.println("And five years ago you were " + (year - 5) + "! imagine that");
    }
}
