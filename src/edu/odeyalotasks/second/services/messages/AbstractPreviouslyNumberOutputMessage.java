package edu.odeyalotasks.second.services.messages;

public abstract class AbstractPreviouslyNumberOutputMessage extends AbstractOutputMessage {
    protected final Integer previouslyNumber;

    public AbstractPreviouslyNumberOutputMessage(String message, Integer previouslyNumber) {
        super(message);
        this.previouslyNumber = previouslyNumber;
    }

    public Integer getPreviouslyNumber() {
        return previouslyNumber;
    }
}
