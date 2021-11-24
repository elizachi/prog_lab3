package characters;
import interfaces.MessagesImpl;
import locations.ConcentrationOfEvil;

public class CreatorNecronomicona extends Character {

    String[] placeDescription = new String[] {"Безумный"};
    int length = placeDescription.length;

    public CreatorNecronomicona(String name) {
        super(name);
    }

    public void afraid(){
        MessagesImpl message = new MessagesImpl();
        ConcentrationOfEvil evil = new ConcentrationOfEvil("сосредоточие зла");
        message.actionMessage("страшился упоминать", this.getName());
        message.simpleObjectMessage(evil.getName(), "");
    }

    public void describe(){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(placeDescription, length, getName(), 0);
    }

}
