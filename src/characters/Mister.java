package characters;

import interfaces.Messages;
import service.MessagesImpl;
import objects.Mountains;

public class Mister extends Character {
    public Mister(String name) {
        super(name);
    }

    public void see(Mountains mountains) {
        Messages message = new MessagesImpl();
        message.actionMessage("видел", this.getName(), mountains);
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: Mister\n" + "name: " + this.getName() +
                "\n" + "description: класс, реализующий персонажей \"Мистер Маусон\" и \"Мистер Уилкс\".";
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
