package characters;

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
        return "type: abstract\n" + "class: Character\n" + "description: абстрактный класс, от которого наследуются классы действующих персонажей.";
    }
}
