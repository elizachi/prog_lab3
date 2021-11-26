import characters.*;
import interfaces.MessagesImpl;
import objects.*;

public class StoryBeginner {
    public static void main(String[] args) {
        MainCharacter a1 = new MainCharacter("Соня");
        MainCharacter a2 = new MainCharacter("Соня");
        System.out.print(a1.equals(a2));
        System.out.print(a1.hashCode() + "\n" + a2.hashCode());
        //System.out.print(mrWilkes.toString());

        PassiveObjects a11 = new PassiveObjects("Кубик", "Красный");
        PassiveObjects a12 = new PassiveObjects("Кубик", "Красный");
        System.out.print(a11.equals(a12));
        System.out.print(a11.hashCode() + "\n" + a12.hashCode());
    }
}
