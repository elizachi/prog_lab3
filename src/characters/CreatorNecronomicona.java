package characters;
import interfaces.Messages;
import service.MessagesImpl;
import objects.PassiveObjects;

public class CreatorNecronomicona extends Character {

    public CreatorNecronomicona(String name) {
        super(name);
    }

    public void afraid(PassiveObjects passiveObject){
        Messages message = new MessagesImpl();
        message.descriptionMessage("Безумный", "", 0);
        message.actionMessage("страшился упоминать", this.getName(), passiveObject);
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
