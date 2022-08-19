package edu.odeyalotasks.practice;

import java.util.Scanner;

/**
 * Завдання 4. Поділ яблук - 2
 * N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
 * Скільки яблук залишиться у кошику?
 * Вхідні дані
 * Програма отримує вхід числа N і K.
 * Вихідні дані
 * Програма повинна вивести кількість яблук.
 * Приклади
 * вхідні дані
 * 3
 * 14
 * вихідні дані
 * 2
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scn.nextInt();
        System.out.print("Enter number of apples: ");
        int apples = scn.nextInt();
        int remainder = apples % students;
        System.out.printf("Remaining apples in bucket: %d", remainder);
    }
}
