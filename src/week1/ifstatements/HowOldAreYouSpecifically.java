package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What your name? ");
        String name = sc.nextLine();
        System.out.println("HI " + name + "! How order You?");
        int year = sc.nextInt();

        if (year < 16) {
            System.out.println("You can't drive, " + name + ".");
        } else if (year >= 16 && 17 >= year) {
            System.out.println("You can drive but not vote, " + name + "." );
        } else if (year >= 18 && 24 <= year)
        {
            System.out.println("You can vote but not rent car, " + name + ".");
        } else{
            System.out.println("You can do pretty much anything, " + name + ".");
        }

    }

}