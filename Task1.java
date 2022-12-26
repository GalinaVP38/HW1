/**
 * Task1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */
public class Task1 {
    public static void main(String[] args) {
        ex1();

    }
    public static void ex1() {
        int n = 5;
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum=sum+i;
        }
        System.out.println("Сумма чисел от 1 до n равна "+sum);
    }
}