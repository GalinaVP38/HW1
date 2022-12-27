import java.util.Scanner;

/**
 * Task1. Вычислить n! (произведение чисел от 1 до n)
 */
public class Task2 {
    public static void main(String[] args) {
        ex2();
    }
    public static void ex2() {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mult = 1;
        for (int i = 2; i < n+1; i++) {
            mult*=i;
        }
        System.out.println("Произведение чисел от 1 до n равно "+mult);
    }
}
