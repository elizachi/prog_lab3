public class CreatorNecronomicona extends Character {
    protected String property;

    CreatorNecronomicona(String name, String property) {
        super(name);
        this.property = property;
    }

    protected void afraid(){
        Messages message = new Messages();
        ConcentrationOfEvil evil = new ConcentrationOfEvil("сосредоточие зла");
        message.actionMessage("страшился упоминать", "");
        message.tempMessage(evil.name, "");
    }

    protected void describe(){
        Messages message = new Messages();
        message.tempMessage(name, property);
    }
}
