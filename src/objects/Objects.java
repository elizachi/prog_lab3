package objects;

// Абстрактный класс, от которого наследуются классы, описывающие все неживые объекты, фигурирующие в истории
public abstract class Objects{
    private final String name;
    private final String properties;

    // геттер для поля "name" объекта
    public String getName() {
        return this.name;
    }
    // геттер для поля "proreties" объекта
    public String getProperties() {
        return this.properties;
    }

    // Контруктор, в который передается название объекта и его свойства (прилагательные)
    Objects(String name, String properties) {
        this.name = name;
        this.properties = properties;
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "type: abstract\n" + "class: Objects\n" + "description: абстрактный класс, от которого наследуются классы неживых объектов.";
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objects objects = (Objects) o;
        return java.util.Objects.equals(name, objects.name) && java.util.Objects.equals(properties, objects.properties);
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, properties);
    }
}
