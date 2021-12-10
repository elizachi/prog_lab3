package characters;
import java.util.Objects;

// Абстрактный класс, от которого наследуются классы, описывающие действующие лица истории
public abstract class Character {
    private final String name;

    // Конструктор данного класса с передачей туда строки для поля name
    Character(String name) {
        this.name = name;
    }

    // Геттер для имени объекта класса
    public String getName(){
        return this.name;
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "type: abstract\n" + "class: Character\n" + "description: абстрактный класс, " +
                "от которого наследуются классы действующих персонажей.";
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
