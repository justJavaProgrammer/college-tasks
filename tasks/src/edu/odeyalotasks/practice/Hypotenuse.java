package edu.odeyalotasks.practice;

import java.util.Scanner;

/**
 * Завдання 1. Гіпотенуза
 * Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами.
 */

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        double sum = Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2);
        System.out.println(String.format("%.5f", Math.sqrt(sum)));
    }
}

