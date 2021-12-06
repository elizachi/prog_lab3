package characters;
import interfaces.Messages;
import objects.PassiveObjects;

public class CreatorNecronomicona extends Character {

    private final Messages messages;

    public CreatorNecronomicona(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    public void afraid(PassiveObjects passiveObject){
        messages.descriptionMessage("Безумный", "", 0);
        messages.actionMessage("страшился упоминать", this.getName(), passiveObject);
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: CreatorNecronomicona\n" + "name: "
                + this.getName() + "\n" + "description: класс, реализующий персонажа \"творец \"Некрономикона \"\".";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
