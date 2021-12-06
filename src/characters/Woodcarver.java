package characters;

import objects.Mountains;
import objects.PassiveObjects;
import service.MessagesImpl;

public class Woodcarver extends Character{
    public Woodcarver(String name) {
        super(name);
    }

    private final MessagesImpl message = new MessagesImpl();

    public void assure(PassiveObjects passiveObject, Mountains firstObject, Mountains secondObject){
        message.descriptionMessage("Древние", "", 0);
        message.actionMessage("уверяли", this.getName(), passiveObject);
        this.conflict(firstObject, secondObject,true);//уступает / не уступает по высоте
    }

    private void conflict(Mountains firstObject, Mountains secondObject, boolean flag) {
        if(flag){
            message.descriptionMessage("\"" + firstObject.getName(), "уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"", 1);
        }
        else {
            message.descriptionMessage("\"" + firstObject.getName(), "не уступает по высоте " +
                    secondObject.getProperties() + " " + secondObject.getName() + "!\"", 1);
        }
    }

    public void doNotSay(PassiveObjects passiveObject, boolean flag){
        if(flag) {
            message.actionMessage("предпочитали не говорить про", this.getName(), passiveObject);
        } else{
            message.actionMessage("с неохотой и робостью брались рассказывать про", this.getName(), passiveObject);
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
