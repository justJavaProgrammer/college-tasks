package edu.odeyalotasks.second.services.messages;

/**
 * Abstract implementation of
 * @see AbstractOutputMessageBuilder
 * Use it to build message that contains previously number
 */
public abstract class AbstractPreviouslyNumberOutputMessageBuilder extends AbstractOutputMessageBuilder {
    protected Integer prevNumber;

    public AbstractPreviouslyNumberOutputMessageBuilder() {
        super();
    }

    public AbstractPreviouslyNumberOutputMessageBuilder prevNumber(Integer prevNumber) {
        this.prevNumber = prevNumber;
        return this;
    }
}
