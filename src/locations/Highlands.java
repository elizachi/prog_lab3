package locations;

import interfaces.MessagesImpl;

public class Highlands extends Location {
    String[] placeDescription = new String[] {"мрачное"};
    int length = placeDescription.length;

    public Highlands(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }
    public void describe(){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(placeDescription, length, getName(), 1);
    }
}
