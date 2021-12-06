package characters;
import interfaces.Exploration;
import interfaces.Messages;
import objects.*;

public class MainCharacter extends Character implements Exploration {

    private final Messages messages;

    public MainCharacter(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    @Override
    public void raid(PassiveObjects passiveObject) {
        messages.actionMessage("облазили и изучили", this.getName(), passiveObject);
    }

    @Override
    public void learn(PassiveObjects passiveObject) {
        messages.actionMessage("узнали", this.getName(),passiveObject);
    }

    @Override
    public void entered(Mountains passiveObject) {
        messages.actionMessage("попали в", this.getName(), passiveObject);
    }

    @Override
    public void belive(Mountains passiveObject) {
        messages.actionMessage("поверили что", this.getName(), passiveObject);
        messages.descriptionMessage("то самое легендарное", "плато Лэнг", 1);
    }


    @Override
    public String toString(){
        return "parent class: Character\n" + "class: MainCharacter\n" +
                "name: " + this.getName() + "\n" + "description: класс, реализующий главное лицо повествования.";
    }

    public static MainCharacter createWe(Messages messages){
        return new MainCharacter("Мы", messages);
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
