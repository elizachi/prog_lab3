package objects;
import interfaces.Messages;
import service.Coordinates;

// Класс, реализующий объекты горного рельефа, с которым сталкиваются главные персонажи
public class Mountains extends Objects {

    protected final Messages messages;

    // Контруктор, в который передается название горного объекта, его свойства (прилагательные) и объект класса message
    // для вывода сообщения о совершении действия на консоль
    public Mountains(String name, String properties, Messages messages) {
        super(name, properties);
        this.messages = messages;
    }

    // Метод, реализующий возможность горного объекта к зарождению
    public void born(PassiveObjects passiveObject){
        messages.descriptionMessage(this.getProperties(), "", 0);
        messages.actionMessage("зарождалась на", this.getName(), passiveObject);
    }

    // Метод, реализующий возможность горного объекта пересекать своей территорией какую-либо другую территорию
    public void cross(PassiveObjects passiveObject){
        messages.actionMessage("пересекала", this.getName(), passiveObject);
    }

    // Метод, реализующий возможность горного объекта образовывать арку
    public void formed() {
        Mountains arch = new Mountains("арку", "величественную", messages);
        messages.descriptionMessage(this.getProperties(), "", 0);
        messages.actionMessage("образует", this.getName(), arch);
        Coordinates coo1 = Coordinates.EASTERN_LONGITUDE1;
        Coordinates coo2 = Coordinates.SOUTHERN_LATITUDE1;
        Coordinates coo3 = Coordinates.EASTERN_LONGITUDE2;
        Coordinates coo4 = Coordinates.SOUTHERN_LATITUDE2;
        messages.descriptionMessage("между", coo1.getTitle() + ", " + coo2.getTitle() + " и " + coo3.getTitle() + ", " + coo4.getTitle(), 1);
    }

    // Внутренний статический класс, описывающий арку, которая может зарождаться только из горного объекта
    public static class Arch extends Mountains{

        // Контруктор, в который передается название арки, ее свойства (прилагательные) и объект класса message
        // для вывода сообщения о совершении действия на консоль
        public Arch(String name, String properties, Messages messages) {
            super(name, properties, messages);
        }

        // Метод, реализующий состояние арки, при котром она стоит на какой-либо территории
        public void stand(PassiveObjects passiveObject){
            messages.actionMessage("стоит возле", this.getName(), passiveObject);
        }

        // Метод, реализующий прерывность арки - т.е. она где-то прерывается, упираясь во что-либо
        public void ends(PassiveObjects passiveObject){
            messages.actionMessage("упирается в", this.getName(), passiveObject);
        }

        // Метод для предоставления информации о классе в виде строки
        @Override
        public String toString(){
            return "type: inner class\n" + "parent class: Mountains\n" + "class: Arch\n" + "name: " +
                    this.getName() + "\n" + "properties: " + this.getProperties() +
                    "\n" + "description: класс, реализующий объект \"Арка\", является внутренним классом класса Mountains";
        }
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
