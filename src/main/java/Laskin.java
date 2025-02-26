import java.util.Scanner;

public class Laskin {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna luku 1: ");
        int a = scanner.nextInt();
        System.out.println("Anna luku 2: ");
        int b = scanner.nextInt();
        System.out.println("Summa: " + add(a, b));
        System.out.println("Erotus: " + subtract(a, b));
        System.out.println("Tulo: " + multiply(a, b));
        System.out.println("Osamaara: " + divide(a, b));

    }
}
