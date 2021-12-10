package characters;
import interfaces.Exploration;
import interfaces.Messages;
import objects.*;

// Класс, реализующий главных героев.
public class MainCharacter extends Character implements Exploration {

    private final Messages messages;

    // Контруктор, в который передается имя персонажа и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public MainCharacter(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    // Метод, реализующий умение персонажа изучить местность. Переопределен из интерйеса Exploretion.
    @Override
    public void raid(PassiveObjects passiveObject) {
        messages.actionMessage("облазили и изучили", this.getName(), passiveObject);
    }

    // Метод, реализующий умение персонажа узнать что-то. Переопределен из интерйеса Exploretion.
    @Override
    public void learn(PassiveObjects passiveObject) {
        messages.actionMessage("узнали", this.getName(),passiveObject);
    }

    // Метод, реализующий способность персонажа попасть куда-либо. Переопределен из интерйеса Exploretion.
    @Override
    public void entered(Mountains passiveObject) {
        messages.actionMessage("попали в", this.getName(), passiveObject);
    }

    // Метод, реализующий способность персонажа поверить во что-либо. Переопределен из интерйеса Exploretion.
    @Override
    public void belive(Mountains passiveObject) {
        messages.actionMessage("поверили что", this.getName(), passiveObject);
        // Иннер класс, который фиг найдешь когда нужно.
        // Реализует объект легендарное плато Ленг, о котором узнали главные герои.
        class LengPlateau {
            private final String properties;
            private final String name;

            LengPlateau(String properties, String name) {
                this.properties = properties;
                this.name = name;
            }
        }
        LengPlateau plateau = new LengPlateau("то самое легендарное", "плато Лэнг");
        messages.descriptionMessage(plateau.properties, plateau.name, 1);
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Character\n" + "class: MainCharacter\n" +
                "name: " + this.getName() + "\n" + "description: класс, реализующий главное лицо повествования.";
    }

    // Метод для более красивого создания экзампляра класса
    public static MainCharacter createWe(Messages messages){
        return new MainCharacter("Мы", messages);
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
