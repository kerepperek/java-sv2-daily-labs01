import java.util.Scanner;
public class something {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjál be egy egész számot. Megmondom, hogy páros-e.");
        System.out.print("A szám: ");
        int number = scanner.nextInt();
        System.out.println((number%2==1)?"Páratlan":"Páros");
    }
}
