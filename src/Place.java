// Самое даинственное, жуткое и зловещее место на земле
public class Place extends Location{
    String[] placeDescription = new String[] {"самое", "таинственное", "жуткое", "зловещее", "древнее"};
    int length = placeDescription.length;

    Place(String name) {
        super(name);
    }

    protected void describe(){
        Messages message = new Messages();
        message.descriptionMessage(placeDescription, length, name);
    }


}
