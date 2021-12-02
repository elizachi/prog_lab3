import characters.*;
import service.MessagesImpl;
import objects.*;

public class StoryBeginner {
    public static void main(String[] args) {
        PassiveObjects house = new PassiveObjects("дом", "этот");
        PassiveObjects goal = new PassiveObjects("цель", "новую");
        PassiveObjects place = new PassiveObjects("место на Земле", "самое таинственное, жуткое, зловещее, древнее");
        PassiveObjects highland = new PassiveObjects("нагорье", "мрачное");
        PassiveObjects evil = new PassiveObjects("сосредоточие зла", "");
        MainCharacter we = new MainCharacter("Мы");
        CreatorNecronomicona creator = new CreatorNecronomicona("творец \"Некрономикона\"");
        Mountains mountainRange = new Mountains("цепь", "Грандиозная горная");
        PassiveObjects land = new PassiveObjects("Земле у моря Уэддела", "");
        PassiveObjects continent = new PassiveObjects("континент", "весь");
        Mountains massif = new Mountains("массив", "Наиболее высокий");
        Arch arch = new Arch("Арка", "");
        PassiveObjects camp = new PassiveObjects("лагеря", "нашего");
        PassiveObjects coast = new PassiveObjects("побережье", "ледяное морское");
        MrWilkes mrWilkes = new MrWilkes("Мистер Уилкс");
        MrMawson mrMawson = new MrMawson("Мистер Маусон");
        Mountains mountains = new Mountains("горы", "эти");
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
        MainCharacter gg = new MainCharacter("Я");
    }
}
