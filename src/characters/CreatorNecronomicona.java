package characters;
import interfaces.Messages;
import objects.PassiveObjects;

// Класс, реализующий персонажа творец "Некрономикона".
public class CreatorNecronomicona extends Character {

    private final Messages messages;

    // Контруктор, в который передается имя персонажа и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public CreatorNecronomicona(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    // Метод, реализующий состояние персонажа - творец страшился упоминать
    public void afraid(PassiveObjects passiveObject){
        messages.descriptionMessage("Безумный", "", 0);
        messages.actionMessage("страшился упоминать", this.getName(), passiveObject);
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Character\n" + "class: CreatorNecronomicona\n" + "name: "
                + this.getName() + "\n" + "description: класс, реализующий персонажа \"творец \"Некрономикона \"\".";
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
