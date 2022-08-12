package edu.odeyalotasks.second.services.printers;

import java.io.PrintStream;

public abstract class AbstractConsoleOutputMessagePrinter implements OutputMessagePrinter {
    protected final PrintStream stream = System.out;
}
