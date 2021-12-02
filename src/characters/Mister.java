package characters;

import service.MessagesImpl;
import objects.Mountains;

public class Mister extends Character {
    public Mister(String name) {
        super(name);
    }

    public void see(Mountains mountains) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessageMount("видел", this.getName(), mountains);
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: Mister\n" + "name: " + this.getName() + "\n" + "description: класс, реализующий персонажа \"Мистер Маусон\".";
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
