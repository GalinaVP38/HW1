/**
 * Task1. Вывести все простые числа от 1 до 1000 (простые числа - 
 * это числа которые делятся только на себя и на единицу без остатка. 
 * Чтобы найти остаток от деления используйте оператор % , 
 * например 10%3 будет равно единице)
 */

public class Task3 {
    public static void main(String[] args) {
        int i, num, count;
        for (num = 1; num <= 1000; num++) {
            count = 0;
            for (i = 2; i <= num/2; i++) {
                if(num%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && num != 1)
            {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }
}
