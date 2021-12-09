package characters;

import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;

public class Woodcarver extends Character{

    private final Messages messages;

    public Woodcarver(String name, Messages messages) {
        super(name);
        this.messages = messages;
    }

    public void assure(PassiveObjects passiveObject, Mountains firstObject, Mountains secondObject, String action, boolean flag){
        messages.descriptionMessage("Древние", "", 0);
        messages.actionMessage(action, this.getName(), passiveObject);
        this.conflict(firstObject, secondObject, flag);//уступает / не уступает по высоте
    }

    private void conflict(Mountains firstObject, Mountains secondObject, boolean flag) {
        if(flag){
            messages.descriptionMessage("\"" + firstObject.getName(), "уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"", 1);
        }
        else {
            messages.descriptionMessage("\"" + firstObject.getName(), "не уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"", 1);
        }
    }

    public void doNotSay(PassiveObjects passiveObject, boolean flag){
        if(flag) {
            messages.actionMessage("предпочитали не говорить про", this.getName(), passiveObject);
        } else{
            messages.actionMessage("с неохотой и робостью брались рассказывать про", this.getName(), passiveObject);
        }
    }

    @Override
    public String toString(){
        return "parent class: Character\n" + "class: Woodcarver\n" + "name: " + this.getName() +
                "\n" + "description: класс, реализующий мастеров, фигурирующих в истории.";
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
