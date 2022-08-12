package edu.odeyalotasks.second.services.support;

import java.util.Scanner;

public class ConsoleNumberScanner implements NumberScanner {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Integer scanNumber() {
        return scanner.nextInt();
    }
}
