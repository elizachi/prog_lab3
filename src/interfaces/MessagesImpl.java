package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public class MessagesImpl implements Messages{

    @Override
    public void descriptionMessage(String properties, String name, int flag){
        System.out.print(properties + " ");
        if(flag == 1){
            System.out.print(name + " ");
        }
    }

    @Override
    public void actionMessagePasObj(String action, Object nameActiveObject, PassiveObjects namePassiveObject){
        System.out.print(nameActiveObject + " " + action + " ");
        descriptionMessage(namePassiveObject.getProperties(), namePassiveObject.getName(), 1);
    }

    @Override
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

    @Override
    public String toString(){
        return "class: MessagesImpl\n" + "description: класс реализует генерацию сообщений для вывода на консоль. Применяется в методах других классов.";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
