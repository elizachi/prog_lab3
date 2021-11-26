package characters;

import interfaces.Exploration;
import interfaces.MessagesImpl;
import objects.Mountains;
import objects.PassiveObjects;

public class MrWilkes extends Character implements Exploration {
    public MrWilkes(String name) {
        super(name);
    }

    @Override
    public void see(Mountains mountains) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessageMount("видел", this.getName(), mountains);
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: MrWilkes\n" + "name: " + this.getName() + "\n" + "description: класс, реализующий персонажа \"Мистер Уиклс\".";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void raid(PassiveObjects passiveObject) {

    }

    @Override
    public void learn(PassiveObjects passiveObject) {

    }

    @Override
    public void entered(PassiveObjects passiveObject) {

    }

    @Override
    public void belive(PassiveObjects passiveObject) {

    }
}
