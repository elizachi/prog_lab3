package characters;

import interfaces.Messages;
import objects.Mountains;

public class Mister extends Character {

    private Messages messages;

    public Mister(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    public void see(Mountains mountains) {
        messages.actionMessage("видел", this.getName(), mountains);
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
