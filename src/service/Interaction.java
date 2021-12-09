package service;

import characters.Woodcarver;
import exceptions.ComandException;
import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;

import java.util.Objects;
import java.util.Scanner;

public class Interaction {

    public void dialog(Woodcarver woodcarver, Mountains range, Messages messages) throws ComandException {
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
                Mountains anotherMountain = new Mountains("хребту", "другому", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяли" ,true);
            }
            else if(Objects.equals(comand, "1 выше")){
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяют",false);
            }
            else if(Objects.equals(comand, "2 выше")){
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяют", true);
            }
            else {
                throw new ComandException("");
            }
        } catch(ComandException e) {
            System.err.print("Такой команды не существует. Попробуйте снова.\n\n");
            this.dialog(woodcarver, range, messages);
        }
    }
}
