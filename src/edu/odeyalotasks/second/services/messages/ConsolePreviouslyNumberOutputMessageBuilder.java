package edu.odeyalotasks.second.services.messages;

public class ConsolePreviouslyNumberOutputMessageBuilder extends AbstractPreviouslyNumberOutputMessageBuilder {
    private Integer currentNumber;

    public ConsolePreviouslyNumberOutputMessageBuilder currentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
        return this;
    }

    @Override
    public AbstractOutputMessage build() {
        return new ConsolePreviouslyNumberOutputMessage(message, currentNumber, prevNumber);
    }
}
