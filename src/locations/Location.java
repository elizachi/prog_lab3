package locations;

import interfaces.Described;

public abstract class Location implements Described {
    private final String name;

    public String getName() {
        return this.name;
    }
    Location(String name) {
        this.name = name;
    }
    public void describe(){}

}
