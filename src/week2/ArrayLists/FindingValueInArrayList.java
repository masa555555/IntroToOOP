package week2.ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            al.add((int) (Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + al);
        Scanner in = new Scanner(System.in);
        System.out.print("Vallue to find: ");
        int toFind = in.nextInt();
        System.out.println();
        for (int elem : al) {
            if (elem == toFind) {
                System.out.println(toFind + " is in the ArrayList.");
            }
        }
        in.close();
     }
}
