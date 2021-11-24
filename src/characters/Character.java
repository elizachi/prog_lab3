package characters;

import interfaces.Described;

public abstract class Character implements Described {
    private final String name;

    Character(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
