package edu.odeyalotasks.second.services.printers;

import edu.odeyalotasks.second.services.messages.AbstractOutputMessage;

public interface OutputMessagePrinter {

    void printMessage(AbstractOutputMessage message);

}
