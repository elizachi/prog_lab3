import characters.*;
import characters.Character;
import interfaces.Messages;
import exceptions.ComandException;
import service.Interaction;
import service.MessagesImpl;

import objects.*;
// TODO переделать, чтобы было более читабельно
public class StoryBeginner {
    public static void main(String[] args) throws ComandException {
        Messages writer = new MessagesImpl();

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

        we.raid(house);
        writer.endOfSentence(0);
        we.learn(goal);
        writer.endOfSentence(0);
        we.entered(place);
        writer.endOfSentence(0);
        we.belive(highland);
        writer.endOfSentence(0);
        creator.afraid(evil);
        writer.endOfSentence(0);
        mountainRange.born(land);
        writer.endOfSentence(0);
        mountainRange.cross(continent);
        writer.endOfSentence(0);
        massif.formed();
        writer.endOfSentence(0);
        arch.stand(camp);
        writer.endOfSentence(0);
        arch.ends(coast);
        writer.endOfSentence(0);
        mrWilkes.see(mountains);
        writer.endOfSentence(0);
        mrMawson.see(mountains);
        writer.endOfSentence(0);
        we.learn(discovery); // here
        writer.endOfSentence(0);
        interaction.dialog(woodcarver, range, writer);
        mystery.hid(mountains);
        writer.endOfSentence(0);
        carver.doNotSay(true);
        writer.endOfSentence(0);
        anotherCarver.doNotSay(false);
        writer.endOfSentence(0);

    }
}
