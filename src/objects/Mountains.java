package objects;

import interfaces.Messages;
import service.Coordinates;
import service.MessagesImpl;

public class Mountains extends Objects {

    public Mountains(String name, String properties) {
        super(name, properties);
    }

        public static class Arch extends Mountains{

        public Arch(String name, String properties) {
            super(name, properties);
        }

        private final Messages message = new MessagesImpl();

        public void stand(PassiveObjects passiveObject){
            message.actionMessage("стоит возле", this.getName(), passiveObject);
        }

        public void ends(PassiveObjects passiveObject){
            message.actionMessage("упирается в", this.getName(), passiveObject);
        }

        @Override
        public String toString(){
            return "type: inner class\n" + "parent class: Mountains\n" + "class: Arch\n" + "name: " +
                    this.getName() + "\n" + "properties: " + this.getProperties() +
                    "\n" + "description: класс, реализующий объект \"Арка\", является внутренним классом класса Mountains";
        }
    }

    private final MessagesImpl message = new MessagesImpl();

    public void born(PassiveObjects passiveObject){
        message.descriptionMessage(this.getProperties(), "", 0);
        message.actionMessage("зарождалась на", this.getName(), passiveObject);
    }

    public void cross(PassiveObjects passiveObject){
        message.actionMessage("пересекала", this.getName(), passiveObject);
    }

    public void formed() {
        Mountains arch = new Mountains("арку", "величественную");
        message.descriptionMessage(this.getProperties(), "", 0);
        message.actionMessage("образует", this.getName(), arch);
        Coordinates coo1 = Coordinates.EASTERN_LONGITUDE1;
        Coordinates coo2 = Coordinates.SOUTHERN_LATITUDE1;
        Coordinates coo3 = Coordinates.EASTERN_LONGITUDE2;
        Coordinates coo4 = Coordinates.SOUTHERN_LATITUDE2;
        message.descriptionMessage("между", coo1.getTitle() + ", " + coo2.getTitle() + " и " + coo3.getTitle() + ", " + coo4.getTitle(), 1);
    }

    @Override
    public String toString(){
        return "parent class: Objects\n" + "class: Arch\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий объект \"Горы\".";
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
