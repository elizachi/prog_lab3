package service;

import characters.Woodcarver;
import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;
import exceptions.ComandException;

import java.util.Objects;
import java.util.Scanner;

public class MessagesImpl implements Messages {

    @Override
    public void descriptionMessage(String properties, String name, int flag){
        System.out.print(properties + " ");
        if(flag == 1){
            System.out.print(name + " ");
        }
    }

    @Override
    public void actionMessage(String action, Object activeObject, PassiveObjects namePassiveObject){
        System.out.print(activeObject + " " + action + " ");
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
    public void actionMessage(String action, Object activeObject, Mountains mountains) {
        System.out.print(activeObject + " " + action + " ");
        descriptionMessage(mountains.getProperties(), mountains.getName(), 1);
    }

    @Override
    public void dialog(Woodcarver woodcarver, Mountains range) throws ComandException {
        System.out.print("Вы вступили в диалог с древними резчиками по дереву.\n" +
                "Как вы считаете, что выше: Гималаи или эти хребты?\n");
        System.out.print("Для того, чтобы ответить на вопрос, введите команду в формате: цифра выше\n" +
                "1 - Гималаи\n" +
                "2 - эти хребты\n" +
                "Чтобы пропустить диалог нажмите enter\n");
        try {
            Scanner console = new Scanner(System.in);
            String comand = console.nextLine();
            if(comand.isEmpty()) {
                PassiveObjects cha = new PassiveObjects("нас", "");
                Mountains anotherMountain = new Mountains("хребту", "другому", this);
                woodcarver.assure(cha, range, anotherMountain, "уверяли" ,true);
            }
            else if(Objects.equals(comand, "1 выше")){
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", this);
                woodcarver.assure(cha, range, anotherMountain, "уверяют",false);
            }
            else if(Objects.equals(comand, "2 выше")){
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", this);
                woodcarver.assure(cha, range, anotherMountain, "уверяют", true);
            }
            else {
                throw new ComandException("");
            }
        } catch(ComandException e) {
            System.err.print("Такой команды не существует. Попробуйте снова.\n\n");
            this.dialog(woodcarver, range);
        }
    }

    @Override
    public String toString(){
        return "class: MessagesImpl\n" + "description: класс реализует генерацию сообщений для вывода на консоль. " +
                "Применяется в методах других классов.";
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
