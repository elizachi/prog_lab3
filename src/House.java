//Дом, который изучили и облазили до последнего уголка
public class House extends Location {
    String[] placeDescription = new String[] {"Этот"};
    int length = placeDescription.length;

    House(String name) {
        super(name);
    }

    protected void describe(){
        Messages message = new Messages();
        message.descriptionMessage(placeDescription, length, name);
    }

}
