package locations;

import interfaces.MessagesImpl;

public class Continent extends Location{
    String[] placeDescription = new String[] {"весь"};
    int length = placeDescription.length;

    public Continent(String name) {
        super(name);
    }
    public void describe(){
        for(int i = 0; i < length; i++) {
            MessagesImpl message = new MessagesImpl();
            message.descriptionMessage(placeDescription, length, getName(), 1);
        }
    }
}
