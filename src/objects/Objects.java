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

    @Override
    public String toString(){
        return "type: abstract\n" + "class: Objects\n" + "description: абстрактный класс, от которого наследуются классы неживых объектов.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objects objects = (Objects) o;
        return java.util.Objects.equals(name, objects.name) && java.util.Objects.equals(properties, objects.properties);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, properties);
    }
}
