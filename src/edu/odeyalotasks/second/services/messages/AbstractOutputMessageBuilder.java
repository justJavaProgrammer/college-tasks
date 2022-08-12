package edu.odeyalotasks.second.services.messages;

public abstract class AbstractOutputMessageBuilder {
    protected String message;

    protected AbstractOutputMessageBuilder() {
    }

    public AbstractOutputMessageBuilder message(String message) {
        this.message = message;
        return this;
    }

    public abstract AbstractOutputMessage build();
}
