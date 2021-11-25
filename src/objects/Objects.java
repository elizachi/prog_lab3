package objects;

public abstract class Objects{
    private final String name;
    private final String properties;

    public String getName() {
        return this.name;
    }
    public String getProperties() {
        return this.properties;
    }
    Objects(String name, String properties) {
        this.name = name;
        this.properties = properties;
    }
    public void describe(){}

}
