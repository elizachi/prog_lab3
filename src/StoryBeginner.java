import characters.*;
import interfaces.Action;
import interfaces.Messages;
import exceptions.ComandException;
import service.Interaction;
import service.MessagesImpl;

import objects.*;

public class StoryBeginner {
    private static final Messages writer = new MessagesImpl();

    public static void main(String[] args) throws ComandException {

        Interaction interaction = new Interaction();

        PassiveObjects house = new PassiveObjects("дом", "этот");
        PassiveObjects goal = new PassiveObjects("цель", "новую");
        PassiveObjects evil = new PassiveObjects("зла", "сосредоточие");
        PassiveObjects land = new PassiveObjects("Уэддела", "Земле у моря");
        PassiveObjects continent = new PassiveObjects("континент", "весь");
        PassiveObjects camp = new PassiveObjects("лагеря", "нашего");
        PassiveObjects coast = new PassiveObjects("побережье", "ледяное морское");
        PassiveObjects discovery = new PassiveObjects("открытие","сокрушительное");

        MainCharacter we = MainCharacter.createWe(writer);

        CreatorNecronomicona creator = new CreatorNecronomicona("творец \"Некрономикона\"", writer);

        Mountains place = new Mountains("место на Земле", "самое таинственное, жуткое, зловещее, древнее", writer);
        Mountains highland = new Mountains("нагорье", "мрачное", writer);
        Mountains mountainRange = new Mountains("цепь", "Грандиозная горная", writer);
        Mountains massif = new Mountains("массив", "Наиболее высокий", writer);
        Mountains.Arch arch = new Mountains.Arch("Арка", "", writer);
        Mountains mountains = new Mountains("горы", "эти", writer);
        Mountains range = new Mountains("хребет", "этот", writer);

        Mister mrWilkes = new Mister("Мистер Уилкс", writer);
        Mister mrMawson = new Mister("Мистер Маусон", writer);

        Woodcarver woodcarver = new Woodcarver("резчики по дереву", writer);
        Woodcarver carver = new Woodcarver("Скульпторы", writer);
        Woodcarver anotherCarver = new Woodcarver("Другие", writer);

        Mystery mystery = new Mystery("тайна", "Мрачная", writer);

        interaction.start();

        doAction(() -> we.raid(house));
        doAction(() -> we.learn(goal));
        doAction(() -> we.entered(place));
        doAction(() -> we.belive(highland));
        doAction(() -> creator.afraid(evil));
        doAction(() -> mountainRange.born(land));
        doAction(() -> mountainRange.cross(continent));

        interaction.arithmetic();

        doAction(() -> massif.formed());
        doAction(() -> arch.stand(camp));
        doAction(() -> arch.ends(coast));
        doAction(() -> mrWilkes.see(mountains));
        doAction(() -> mrMawson.see(mountains));
        doAction(() -> we.learn(discovery));

        interaction.dialog(woodcarver, range, writer);

        doAction(() -> mystery.hid(mountains));
        doAction(() -> carver.doNotSay(true));
        doAction(() -> anotherCarver.doNotSay(false));
    }

    private static void doAction(Action action) {
        action.endOfSentence();
        writer.endOfSentence(0);
    }
}