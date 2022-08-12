package edu.odeyalotasks.second;

import edu.odeyalotasks.second.config.SecondTaskApplicationConfiguration;

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
public class Main {
    public static void main(String[] args) {
        SecondTask.run(new SecondTaskApplicationConfiguration());
    }
}
