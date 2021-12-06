package objects;

import interfaces.Messages;
import service.Coordinates;

public class Mountains extends Objects {

    protected final Messages messages;

    public Mountains(String name, String properties, Messages messages) {
        super(name, properties);
        this.messages = messages;
    }

    public void born(PassiveObjects passiveObject){
        messages.descriptionMessage(this.getProperties(), "", 0);
        messages.actionMessage("зарождалась на", this.getName(), passiveObject);
    }

    public void cross(PassiveObjects passiveObject){
        messages.actionMessage("пересекала", this.getName(), passiveObject);
    }

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

    public static class Arch extends Mountains{

        public Arch(String name, String properties, Messages messages) {
            super(name, properties, messages);
        }

        public void stand(PassiveObjects passiveObject){
            messages.actionMessage("стоит возле", this.getName(), passiveObject);
        }

        public void ends(PassiveObjects passiveObject){
            messages.actionMessage("упирается в", this.getName(), passiveObject);
        }

        @Override
        public String toString(){
            return "type: inner class\n" + "parent class: Mountains\n" + "class: Arch\n" + "name: " +
                    this.getName() + "\n" + "properties: " + this.getProperties() +
                    "\n" + "description: класс, реализующий объект \"Арка\", является внутренним классом класса Mountains";
        }
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
