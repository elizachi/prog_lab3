package objects;

public abstract class SimpleObject {
    private final String name;
    private final String property;

    SimpleObject(String name, String property) {
        this.name = name;
        this.property = property;
    }

    public String getName() {
        return this.name;
    }

    public String getProperty() {
        return this.property;
    }
}
