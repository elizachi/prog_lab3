package objects;

import service.MessagesImpl;

public class Arch extends Mountains{

    public Arch(String name, String properties) {
        super(name, properties);
    }

    MessagesImpl message = new MessagesImpl();

    public void stand(PassiveObjects passiveObject){
        message.actionMessagePasObj("стоит возле", this.getName(), passiveObject);
    }

    public void ends(PassiveObjects passiveObject){
        message.actionMessagePasObj("упирается в", this.getName(), passiveObject);
    }

    @Override
    public String toString(){
        return "parent class: Mountains\n" + "class: Arch\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий объект \"Арка\"";
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
