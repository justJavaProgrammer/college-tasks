import java.util.Scanner;

/**
 * Завдання 3. Поділ яблук - 1
 * N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
 * Скільки яблук дістанеться кожному школяреві?
 * Вхідні дані
 * Програма отримує вхід числа N і K.
 * Вихідні дані
 * Програма повинна вивести кількість яблук.
 * Приклади
 * вхідні дані
 * 3
 * 14
 * вихідні дані
 * 4
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scn.nextInt();
        System.out.print("Enter number of apples: ");
        int apples = scn.nextInt();
        int formula = apples / students;
        System.out.println("Every student will get: " + formula);
    }
}
