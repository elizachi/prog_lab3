import characters.*;
import service.MessagesImpl;
import objects.*;
// TODO переделать, чтобы было более читабельно
public class StoryBeginner {
    public static void main(String[] args) {
        PassiveObjects house = new PassiveObjects("дом", "этот");
        PassiveObjects goal = new PassiveObjects("цель", "новую");
        PassiveObjects evil = new PassiveObjects("зла", "сосредоточие");
        PassiveObjects land = new PassiveObjects("Уэддела", "Земле у моря");
        PassiveObjects continent = new PassiveObjects("континент", "весь");
        PassiveObjects camp = new PassiveObjects("лагеря", "нашего");
        PassiveObjects coast = new PassiveObjects("побережье", "ледяное морское");
        PassiveObjects discovery = new PassiveObjects("открытие","сокрушительное");
        PassiveObjects cha = new PassiveObjects("нас", "");
        PassiveObjects theme = new PassiveObjects("тему", "эту");

        MainCharacter we = new MainCharacter("Мы");

        CreatorNecronomicona creator = new CreatorNecronomicona("творец \"Некрономикона\"");

        Mountains place = new Mountains("место на Земле", "самое таинственное, жуткое, зловещее, древнее");
        Mountains highland = new Mountains("нагорье", "мрачное");
        Mountains mountainRange = new Mountains("цепь", "Грандиозная горная");
        Mountains massif = new Mountains("массив", "Наиболее высокий");
        Mountains.Arch arch = new Mountains.Arch("Арка", "");
        Mountains mountains = new Mountains("горы", "эти");
        Mountains range = new Mountains("хребет", "этот");
        Mountains anotherRange = new Mountains("хребту", "ещё более грандиозному");

        Mister mrWilkes = new Mister("Мистер Уилкс");
        Mister mrMawson = new Mister("Мистер Маусон");

        Woodcarver woodcarver = new Woodcarver("резчики по дереву");
        Woodcarver carver = new Woodcarver("Скульпторы");
        Woodcarver anotherCarver = new Woodcarver("Другие");

        Mystery mystery = new Mystery("тайна", "Мрачная");

        MessagesImpl writer = new MessagesImpl();

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
        we.learn(discovery);
        writer.endOfSentence(0);
        woodcarver.assure(cha, range, anotherRange);
        writer.endOfSentence(0);
        mystery.hid(mountains);
        writer.endOfSentence(0);
        carver.doNotSay(theme, true);
        writer.endOfSentence(0);
        anotherCarver.doNotSay(theme, false);
        writer.endOfSentence(0);
    }
}
