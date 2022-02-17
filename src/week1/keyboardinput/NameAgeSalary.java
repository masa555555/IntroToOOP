package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("HI " + name + "! How order You?");
        int year = scan.nextInt();
        System.out.println("So you're " + year + ",eh? That,s not old at all!");
        System.out.println("How much do you make," + name);
        double salary = scan.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year!LOL!");

    }
}
