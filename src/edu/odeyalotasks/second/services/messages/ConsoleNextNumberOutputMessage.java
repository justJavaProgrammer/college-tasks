package edu.odeyalotasks.second.services.messages;

public class ConsoleNextNumberOutputMessage extends AbstractNextNumberOutputMessage {

    public ConsoleNextNumberOutputMessage(String message, Integer currentNumber, Integer nextNumber) {
        super(message, currentNumber, nextNumber);
    }

    @Override
    public String getBuiltMessage() {
        if (message == null) {
            return String.format(DEFAULT_NEXT_NUMBER_OUTPUT_MESSAGE_PATTERN_VALUE, currentNumber, nextNumber);
        }
        return String.format(message, currentNumber, nextNumber);
    }
}
