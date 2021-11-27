package characters;

import service.MessagesImpl;
import objects.Mountains;

public class MrWilkes extends Character {
    public MrWilkes(String name) {
        super(name);
    }

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

}
