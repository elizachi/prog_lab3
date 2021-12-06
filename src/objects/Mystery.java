package objects;

import interfaces.Messages;
import service.MessagesImpl;

public class Mystery extends Objects{
    public Mystery(String name, String properties) {
        super(name, properties);
    }

    public void hid(Mountains object){
        Messages message = new MessagesImpl();
        message.descriptionMessage(getProperties(), "", 0);
        message.actionMessage("окутывала", this.getName(), object);
    }
}
