package characters;

import java.util.Objects;

public abstract class Character {
    private final String name;

    Character(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "type: abstract\n" + "class: Character\n" + "description: абстрактный класс, " +
                "от которого наследуются классы действующих персонажей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
