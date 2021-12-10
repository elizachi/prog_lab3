package objects;

public class PassiveObjects extends Objects {

    // Контруктор, в который передается название пассивного объекта и его свойства (прилагательные)
    public PassiveObjects(String name, String properties) {
        super(name, properties);
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Objects\n" + "class: PassiveObjects\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий неживые объекты, над которыми совершаются какие-либо действия.";
    }

    // Пробный метод, созданный только для того, чтобы показать, что в анонимном классе можно переопределять методы
    public void meow() {
        System.out.println("Meow!");
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
