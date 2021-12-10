package characters;
import interfaces.Messages;
import objects.Mountains;

// Класс, реализующий персонажей мистер Уилкс и мистер Маусон
public class Mister extends Character {

    private final Messages messages;

    // Контруктор, в который передается имя персонажа и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public Mister(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    // Метод, реализующий способность персонажа сообщать о том, что он уже видел все в этой жизни.
    // Да, даже тот мем, который ты недавно ему прислал.
    public void see(Mountains mountains) {
        messages.actionMessage("видел", this.getName(), mountains);
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Character\n" + "class: Mister\n" + "name: " + this.getName() +
                "\n" + "description: класс, реализующий персонажей \"Мистер Маусон\" и \"Мистер Уилкс\".";
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
