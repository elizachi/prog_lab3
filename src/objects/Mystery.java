package objects;

import service.MessagesImpl;

public class Mystery extends Objects{
    public Mystery(String name, String properties) {
        super(name, properties);
    }

    public void hid(Mountains object){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(getProperties(), "", 0);
        message.actionMessageMount("окутывала", this.getName(), object);
    }
}
