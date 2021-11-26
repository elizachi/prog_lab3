package objects;

import interfaces.MessagesImpl;

public class Arch extends Mountains{
    public Arch(String name, String properties) {
        super(name, properties);
    }
    public void stand(PassiveObjects passiveObject){
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("стоит возле", this.getName(), passiveObject);
    }

    public void ends(PassiveObjects passiveObject){
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("упирается в", this.getName(), passiveObject);
    }

    @Override
    public String toString(){
        return "parent class: Mountains\n" + "class: Arch\n" + "name: " + this.getName() + "\n" + "properties: " + this.getProperties() + "\n" + "description: класс, реализующий объект \"Арка\"";
    }
}
