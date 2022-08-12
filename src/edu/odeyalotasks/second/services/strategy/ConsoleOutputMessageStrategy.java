package edu.odeyalotasks.second.services.strategy;

import edu.odeyalotasks.second.services.messages.AbstractPreviouslyNumberOutputMessage;
import edu.odeyalotasks.second.services.messages.ConsolePreviouslyNumberOutputMessage;

public class ConsoleOutputMessageStrategy implements OutputMessageStrategy {

//    private final AbstractPreviouslyNumberOutputMessage message;

    public ConsoleOutputMessageStrategy() {
//        this.message = new ConsolePreviouslyNumberOutputMessage()
    }

    @Override
    public String getMessage() {
        return null;
    }
}
