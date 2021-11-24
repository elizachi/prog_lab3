package locations;

import interfaces.MessagesImpl;

//Дом, который изучили и облазили до последнего уголка
public class House extends Location {
    String[] placeDescription = new String[] {"Этот"};
    int length = placeDescription.length;

    public House(String name) {
        super(name);
    }

    public void describe(){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(placeDescription, length, this.getName(), 1);
    }

}
