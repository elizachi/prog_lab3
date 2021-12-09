package objects;

public class PassiveObjects extends Objects {

    public PassiveObjects(String name, String properties) {
        super(name, properties);
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public String toString(){
        return "parent class: Objects\n" + "class: PassiveObjects\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий неживые объекты, над которыми совершаются какие-либо действия.";
    }

    public void meow() {
        System.out.println("Meow!");
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
