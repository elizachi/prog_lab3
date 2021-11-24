package locations;

import interfaces.MessagesImpl;

public class Place extends Location {
    String[] placeDescription = new String[] {"самое", "таинственное", "жуткое", "зловещее", "древнее"};
    int length = placeDescription.length;

    public Place(String name) {
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
