package characters;
import interfaces.MessagesImpl;
import objects.PassiveObjects;

public class CreatorNecronomicona extends Character {

    public CreatorNecronomicona(String name) {
        super(name);
    }

    public void afraid(PassiveObjects passiveObject){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage("Безумный", "", 0);
        message.actionMessagePasObj("страшился упоминать", this.getName(), passiveObject);
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: CreatorNecronomicona\n" + "name: " + this.getName() + "\n" + "description: класс, реализующий персонажа \"творец \"Некрономикона \"\".";
    }

}
