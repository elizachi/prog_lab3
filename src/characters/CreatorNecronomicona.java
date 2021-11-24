package characters;
import interfaces.MessagesImpl;
import locations.ConcentrationOfEvil;

public class CreatorNecronomicona extends Character {
    private final String property;

    public CreatorNecronomicona(String name, String property) {
        super(name);
        this.property = property;
    }

    public void afraid(){
        MessagesImpl message = new MessagesImpl();
        ConcentrationOfEvil evil = new ConcentrationOfEvil("сосредоточие зла");
        message.actionMessage("страшился упоминать", "");
        message.tempMessage(evil.getName(), "");
    }

    public void describe(){
        MessagesImpl message = new MessagesImpl();
        message.tempMessage(this.getName(), property);
    }
}
