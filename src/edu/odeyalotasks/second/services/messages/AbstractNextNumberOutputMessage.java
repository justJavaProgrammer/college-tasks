package edu.odeyalotasks.second.services.messages;

public abstract class AbstractNextNumberOutputMessage extends AbstractOutputMessage {
    public static final String DEFAULT_NEXT_NUMBER_OUTPUT_MESSAGE_PATTERN_VALUE = "The next number of %d is %s";
    protected final Integer nextNumber;
    protected final Integer currentNumber;

    public AbstractNextNumberOutputMessage(String message, Integer currentNumber, Integer nextNumber) {
        super(message);
        this.currentNumber = currentNumber;
        this.nextNumber = nextNumber;
    }

    public Integer getNextNumber() {
        return nextNumber;
    }

    public Integer getCurrentNumber() {
        return currentNumber;
    }
}
