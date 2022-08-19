package edu.odeyalotasks.practice;

import java.util.Scanner;

/**
 * Завдання 2. Наступне та попереднє
 * Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
 * прикладі. Прогалини, розділові знаки, великі і малі літери важливі!
 * Вхідні дані
 * Вводиться ціле число, за модулем, що не перевищує 10000.
 * Вихідні дані
 * Виведіть спочатку фразу "The next number for the number", потім введене число, потім
 * слово "is", оточене пробілами, потім формулу для наступного за введеним числом,
 * нарешті, знак точки без пробілу. Аналогічно у наступному рядку для попереднього числа.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int next = number + 1;
        int prev = number - 1;
        System.out.printf("The next number for the number %d is %d.%n", number, next);
        System.out.printf("The previous number for the number %d is %d.%n", number, prev);
    }
}

