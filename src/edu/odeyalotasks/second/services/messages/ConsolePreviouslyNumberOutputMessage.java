package edu.odeyalotasks.second.services.messages;

public class ConsolePreviouslyNumberOutputMessage extends AbstractPreviouslyNumberOutputMessage {
    public static final String DEFAULT_CONSOLE_PREVIOUSLY_NUMBER_MESSAGE_BODY_TEXT_PATTERN_VALUE = "The previous number for the number %d is %s";
    private final Integer currentNumber;

    public ConsolePreviouslyNumberOutputMessage(String message, Integer currentNumber, Integer previouslyNumber) {
        super(message, previouslyNumber);
        this.currentNumber = currentNumber;
    }


    @Override
    public String getBuiltMessage() {
        if (message == null) {
            return String.format(DEFAULT_CONSOLE_PREVIOUSLY_NUMBER_MESSAGE_BODY_TEXT_PATTERN_VALUE, currentNumber, previouslyNumber);
        }
        return String.format(message, currentNumber, previouslyNumber);
    }
}
