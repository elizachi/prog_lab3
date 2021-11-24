package locations;

import interfaces.MessagesImpl;

public class LengPlateau extends Location {
    String[] placeDescription = new String[] {"то самое", "легендарное"};
    int length = placeDescription.length;

    public LengPlateau(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    public void describe(){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(placeDescription, length, getName());
    }
}
