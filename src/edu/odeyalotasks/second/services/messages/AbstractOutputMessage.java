package edu.odeyalotasks.second.services.messages;

public abstract class AbstractOutputMessage {
    protected String message;

    public AbstractOutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract String getBuiltMessage();

}
