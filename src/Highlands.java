public class Highlands extends Location{
    String[] placeDescription = new String[] {"мрачное"};
    int length = placeDescription.length;

    Highlands(String name) {
        super(name);
    }

    protected void describe(){
        Messages message = new Messages();
        message.descriptionMessage(placeDescription, length, name);
    }
}
