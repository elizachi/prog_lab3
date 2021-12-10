package objects;
import interfaces.Messages;

// класс, описывающий отельную категорию мистических объектов, совершающих действия над горными объектами
public class Mystery extends Objects{

    private final Messages messages;

    // Контруктор, в который передается название мистического объекта, его свойства (прилагательные) и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public Mystery(String name, String properties, Messages messages) {
        super(name, properties);
        this.messages = messages;
    }

    // Метод, реализующий умение мистического объекта скрывать горный объект
    public void hid(Mountains object){
        messages.descriptionMessage(getProperties(), "", 0);
        messages.actionMessage("окутывала", this.getName(), object);
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Objects\n" + "class: Arch\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий объект \"Горы\".";
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
