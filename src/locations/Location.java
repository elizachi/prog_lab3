package locations;

public abstract class Location {
    private final String name;

    public String getName() {
        return name;
    }
    Location(String name) {
        this.name = name;
    }
    protected void describe(){}

}
