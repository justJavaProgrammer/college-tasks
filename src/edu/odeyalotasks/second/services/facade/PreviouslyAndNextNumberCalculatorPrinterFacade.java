package edu.odeyalotasks.second.services.facade;

import edu.odeyalotasks.second.services.NextNumberResolver;
import edu.odeyalotasks.second.services.PreviouslyNumberResolver;
import edu.odeyalotasks.second.services.messages.ConsoleNextNumberOutputMessage;
import edu.odeyalotasks.second.services.messages.ConsolePreviouslyNumberOutputMessage;
import edu.odeyalotasks.second.services.printers.OutputMessagePrinter;

public class PreviouslyAndNextNumberCalculatorPrinterFacade implements NumberCalculatorPrinterFacade {
    private final NextNumberResolver nextNumberResolver;
    private final PreviouslyNumberResolver previouslyNumberResolver;
    private final OutputMessagePrinter printer;

    public PreviouslyAndNextNumberCalculatorPrinterFacade(NextNumberResolver nextNumberResolver, PreviouslyNumberResolver previouslyNumberResolver, OutputMessagePrinter printer) {
        this.nextNumberResolver = nextNumberResolver;
        this.previouslyNumberResolver = previouslyNumberResolver;
        this.printer = printer;
    }

    @Override
    public void print(Integer number) {
        Integer nextNumber = this.nextNumberResolver.getNextNumber(number);
        Integer prevNumber = this.previouslyNumberResolver.resolvePreviouslyNumber(number);
        this.printer.printMessage(new ConsolePreviouslyNumberOutputMessage(ConsolePreviouslyNumberOutputMessage.DEFAULT_CONSOLE_PREVIOUSLY_NUMBER_MESSAGE_BODY_TEXT_PATTERN_VALUE, number, prevNumber));
        this.printer.printMessage(new ConsoleNextNumberOutputMessage(ConsoleNextNumberOutputMessage.DEFAULT_NEXT_NUMBER_OUTPUT_MESSAGE_PATTERN_VALUE, number, nextNumber));
    }
}
