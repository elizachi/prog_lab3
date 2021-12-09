package service;

import characters.Woodcarver;
import exceptions.ComandException;
import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;

import java.util.Objects;
import java.util.Scanner;

public class Interaction {

    public void start(){
        System.out.print("Вы начали свое путешествие.\n\n");
        System.out.print("Пробираясь сквозь густую чащу леса вы вышли к заброшенному дому, где повстречали двух мужчин.\n\n");
        System.out.print("Они считают вас подозрительным и требуют вас назвать своё имя. Введите имя.\n\n");
        try {
            Scanner console = new Scanner(System.in);
            String gamerName = console.nextLine();
            if(gamerName.isEmpty()) {
                throw new ComandException("");
            }
            else if(gamerName.length() > 10){
                System.out.print("Мужчины перед вами представились Уиклсом и Маусоном.\n\n");
                System.out.print("Ваше имя слишком длинное, они будут звать вас " + gamerName.substring(0, 9) +".\n\n");
                System.out.print("Вам по пути, поэтому дальше вы пойдете вместе. Ваша история началась.\n" +
                        "Поведайте нам о ней.\n\n");
            }
            else {
                System.out.print("Мужчины перед вами представились Уиклсом и Маусоном.\n\n");
                System.out.print("Вам по пути, поэтому дальше вы пойдете вместе. Ваша история началась.\n" +
                        "Поведайте нам о ней.\n\n");

            }
        } catch(ComandException e) {
            System.err.print("Молчать не очень дружелюбно. Вспомните, в какой вы ситуации:\n\n");
            this.start();
        }
    }

    public void dialog(Woodcarver woodcarver, Mountains range, Messages messages) throws ComandException {
        System.out.print("Вы и ваши компаньоны вступили в диалог с древними резчиками по дереву.\n" +
                "Как вы считаете, что выше: Гималаи или эти хребты?\n");
        System.out.print("Для того, чтобы ответить на вопрос, введите команду в формате: цифра выше\n" +
                "1 - Гималаи\n" +
                "2 - эти хребты\n" +
                "Чтобы пропустить диалог нажмите enter\n");
        try {
            Scanner console = new Scanner(System.in);
            String comand = console.nextLine();
            if(comand.isEmpty()) {
                System.out.print("Вы решили не разговаривать с древними резчиками по дереву и ушли.");
                PassiveObjects cha = new PassiveObjects("нам вслед", "");
                Mountains anotherMountain = new Mountains("хребту", "другому", messages);
                woodcarver.assure(cha, range, anotherMountain, "кричали" ,true);
            }
            else if(Objects.equals(comand, "1 выше")){
                System.out.print("- Ответили вы.\n");
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяют",false);
            }
            else if(Objects.equals(comand, "2 выше")){
                System.out.print("- Ответили вы.\n");
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
