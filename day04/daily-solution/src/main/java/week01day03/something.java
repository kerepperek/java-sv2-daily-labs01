package week01day03;

import java.math.BigInteger;
import java.util.Scanner;
public class something {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjál be egy egész számot. Megmondom, hogy páros-e.");
        System.out.print("A szám: ");
        int number = scanner.nextInt();
        System.out.println(number==0?"Nulla":number%2==0?"Páratlan":"Páros");
    }
}
