public class LengPlateau extends Location{
    String[] placeDescription = new String[] {"то самое", "легендарное"};
    int length = placeDescription.length;

    LengPlateau(String name) {
        super(name);
    }

    protected void describe(){
        Messages message = new Messages();
        message.descriptionMessage(placeDescription, length, name);
    }
}
