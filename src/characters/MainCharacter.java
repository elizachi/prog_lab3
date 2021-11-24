package characters;
import interfaces.Explorable;
import interfaces.MessagesImpl;
import locations.*;
import objects.Goal;

public class MainCharacter extends Character implements Explorable {

    public MainCharacter(String name) {
        super(name);
    }

    @Override
    public void raid() {
        MessagesImpl message = new MessagesImpl();
        message.actionMessage("облазили", this.getName());
    }

    @Override
    public void explore() {
        MessagesImpl message = new MessagesImpl();
        message.actionMessage("изучили", this.getName());
    }

    @Override
    public void learn() {
        Goal goal = new Goal("цель", "новую");
        MessagesImpl message = new MessagesImpl();
        message.actionMessage("узнали", this.getName());
        message.tempMessage(goal.getName(), goal.getProperty());
    }

    @Override
    public void entered() {
        Place placeOfTheWorld = new Place("место на земле");
        MessagesImpl message = new MessagesImpl();
        message.actionMessage("попали", this.getName());
        placeOfTheWorld.describe();
    }

    @Override
    public void belive() {
        MessagesImpl message = new MessagesImpl();
        message.actionMessage("поверили", this.getName());
        message.endOfSentence(1);
        Highlands highlands = new Highlands("нагорье");
        LengPlateau plateau = new LengPlateau("плато Ленг");
        highlands.describe();
        plateau.describe();
    }
}
