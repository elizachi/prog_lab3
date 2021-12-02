package characters;

import objects.Mountains;
import objects.Objects;
import objects.PassiveObjects;
import service.MessagesImpl;

public class Woodcarver extends Character{
    public Woodcarver(String name) {
        super(name);
    }

    private final MessagesImpl message = new MessagesImpl();

    public void assure(PassiveObjects passiveObject, Mountains firstObject, Mountains secondObject){
        message.descriptionMessage("Древние", "", 0);
        message.actionMessagePasObj("уверяли", this.getName(), passiveObject);
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
            message.actionMessagePasObj("предпочитали не говорить про", this.getName(), passiveObject);
        } else{
            message.actionMessagePasObj("с неохотой и робостью брались рассказывать про", this.getName(), passiveObject);
        }
    }
}
