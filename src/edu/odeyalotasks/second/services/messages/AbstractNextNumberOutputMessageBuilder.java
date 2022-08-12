package edu.odeyalotasks.second.services.messages;

public abstract class AbstractNextNumberOutputMessageBuilder extends AbstractOutputMessageBuilder {
    protected Integer nextNumber;
    protected Integer currentNumber;

    private AbstractNextNumberOutputMessageBuilder() {
    }

    public abstract AbstractNextNumberOutputMessage builder();

    public AbstractNextNumberOutputMessageBuilder nextNumber(Integer nextNumber) {
        this.nextNumber = nextNumber;
        return this;
    }

    public AbstractNextNumberOutputMessageBuilder currentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
        return this;
    }
    public abstract AbstractNextNumberOutputMessage build();
}
