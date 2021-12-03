package characters;
import interfaces.Exploration;
import service.MessagesImpl;
import objects.*;

public class MainCharacter extends Character implements Exploration {

    public MainCharacter(String name) {
        super(name);
    }

    private final MessagesImpl message = new MessagesImpl();

    @Override
    public void raid(PassiveObjects passiveObject) {
        message.actionMessagePasObj("облазили и изучили", this.getName(), passiveObject);
    }

    @Override
    public void learn(PassiveObjects passiveObject) {
        message.actionMessagePasObj("узнали", this.getName(),passiveObject);
    }

    @Override
    public void entered(Mountains passiveObject) {
        message.actionMessageMount("попали в", this.getName(), passiveObject);
    }

    @Override
    public void belive(Mountains passiveObject) {
        message.actionMessageMount("поверили что", this.getName(), passiveObject);
        message.descriptionMessage("то самое легендарное", "плато Лэнг", 1);
    }


    @Override
    public String toString(){
        return "parent class: Character\n" + "class: MainCharacter\n" +
                "name: " + this.getName() + "\n" + "description: класс, реализующий главное лицо повествования.";
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
