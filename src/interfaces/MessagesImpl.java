package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public class MessagesImpl implements Messages{
    public void descriptionMessage(String properties, String name, int flag){
        System.out.print(properties + " ");
        if(flag == 1){
            System.out.print(name + " ");
        }
    }

    public void actionMessagePasObj(String action, Object nameActiveObject, PassiveObjects namePassiveObject){
        System.out.print(nameActiveObject + " " + action + " ");
        descriptionMessage(namePassiveObject.getProperties(), namePassiveObject.getName(), 1);
    }

    public void endOfSentence(int number){
        if(number == 0){
            System.out.print(".\n");
        } else if(number == 1){
            System.out.print(": ");
        }

    }

    @Override
    public void actionMessageMount(String action, Object nameActiveObject, Mountains mountains) {
        System.out.print(nameActiveObject + " " + action + " ");
        descriptionMessage(mountains.getProperties(), mountains.getName(), 1);
    }
}
