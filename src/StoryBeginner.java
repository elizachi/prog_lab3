import characters.*;
import interfaces.MessagesImpl;
import locations.*;

public class StoryBeginner {
    public static void main(String[] args) {
        House house = new House("дом");
        MainCharacter we = new MainCharacter("Мы");
        CreatorNecronomicona creator = new CreatorNecronomicona("творец \"Некрономикона\"", "Безумный");
        MessagesImpl writer = new MessagesImpl();
        house.describe();
        we.raid();
        we.explore();
        writer.endOfSentence(0);
        we.learn();
        writer.endOfSentence(0);
        we.entered();
        writer.endOfSentence(0);
        we.belive();
        writer.endOfSentence(0);
        creator.describe();
        creator.afraid();
        writer.endOfSentence(0);
    }
}
