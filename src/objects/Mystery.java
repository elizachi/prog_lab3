package objects;

import interfaces.Messages;

public class Mystery extends Objects{

    private final Messages messages;

    public Mystery(String name, String properties, Messages messages) {
        super(name, properties);
        this.messages = messages;
    }

    public void hid(Mountains object){
        messages.descriptionMessage(getProperties(), "", 0);
        messages.actionMessage("окутывала", this.getName(), object);
    }
}
