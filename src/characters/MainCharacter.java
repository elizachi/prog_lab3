package characters;
import interfaces.Exploration;
import interfaces.MessagesImpl;
import objects.*;

public class MainCharacter extends Character implements Exploration {

    public MainCharacter(String name) {
        super(name);
    }

    @Override
    public void raid(PassiveObjects passiveObject) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("облазили и изучили", this.getName(), passiveObject);
    }

    @Override
    public void learn(PassiveObjects passiveObject) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("узнали", this.getName(),passiveObject);
    }

    @Override
    public void entered(PassiveObjects passiveObject) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("попали в", this.getName(), passiveObject);
    }

    @Override
    public void belive(PassiveObjects passiveObject) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("поверили что", this.getName(), passiveObject);
        message.descriptionMessage("то самое легендарное", "плато Лэнг", 1);
    }

    @Override
    public void see(Mountains mountains) {

    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: MainCharacter\n" + "name: " + this.getName() + "\n" + "description: класс, реализующий главное лицо повествования.";
    }

}
