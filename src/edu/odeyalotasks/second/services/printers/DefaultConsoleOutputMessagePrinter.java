package edu.odeyalotasks.second.services.printers;

import edu.odeyalotasks.second.services.messages.AbstractOutputMessage;

public class DefaultConsoleOutputMessagePrinter extends AbstractConsoleOutputMessagePrinter {

    @Override
    public void printMessage(AbstractOutputMessage message) {
        stream.println(message.getBuiltMessage());
    }
}
