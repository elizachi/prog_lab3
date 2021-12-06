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
        message.actionMessage("облазили и изучили", this.getName(), passiveObject);
    }

    @Override
    public void learn(PassiveObjects passiveObject) {
        message.actionMessage("узнали", this.getName(),passiveObject);
    }

    @Override
    public void entered(Mountains passiveObject) {
        message.actionMessage("попали в", this.getName(), passiveObject);
    }

    @Override
    public void belive(Mountains passiveObject) {
        message.actionMessage("поверили что", this.getName(), passiveObject);
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
