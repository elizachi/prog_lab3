package characters;
import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;

// Класс, реализующий персонажей мастеров, встречающихся в истории
public class Woodcarver extends Character{

    private final Messages messages;

    // Контруктор, в который передается имя персонажа и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public Woodcarver(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    // Метод, реализующий способность персонажа убеждать в своей правоте
    public void assure(PassiveObjects passiveObject, Mountains firstObject, Mountains secondObject, String action, boolean flag){
        messages.descriptionMessage("Древние", "", 0);
        messages.actionMessage(action, this.getName(), passiveObject);
        this.conflict(firstObject, secondObject, flag);//уступает / не уступает по высоте
    }

    // метод, реализующий способность персонажа спорить с любым сказанным ему утверждением
    private void conflict(Mountains firstObject, Mountains secondObject, boolean flag) {
        if(flag){
            messages.descriptionMessage("\"" + firstObject.getName(), "уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"\n", 1);
        }
        else {
            messages.descriptionMessage("\"" + firstObject.getName(), "не уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"\n", 1);
        }
    }

    // Метод, реализующий нежелание персонажа говорить на определенную тему
    public void doNotSay(boolean flag){
        // Анонимные классы. Первый с переопределением метода, второй - без.
        PassiveObjects topic = new PassiveObjects("тему", "эту"){
            @Override
            public void meow(){
                System.out.print("notmeow");
            }
        };
        PassiveObjects thisTopicToo = new PassiveObjects("этом", "об"){};
        if(flag) {
            messages.actionMessage("предпочитали не говорить про", this.getName(), topic);
        } else{
            messages.actionMessage("с неохотой и робостью брались рассказывать", this.getName(), thisTopicToo);
        }
    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "parent class: Character\n" + "class: Woodcarver\n" + "name: " + this.getName() +
                "\n" + "description: класс, реализующий мастеров, фигурирующих в истории.";
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
