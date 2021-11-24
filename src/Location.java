public abstract class Location {
    protected String name;

    public String getName() {
        return name;
    }
    Location(String name) {
        this.name = name;
    }
    protected void describe(){}

}
