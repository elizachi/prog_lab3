//Мы
public class MainCharacter extends Character implements Explorable{
    public MainCharacter(String name) {
        super(name);
    }

    @Override
    public void raid() {
        Messages message = new Messages();
        message.actionMessage("облазили", name);
    }

    @Override
    public void explore() {
        Messages message = new Messages();
        message.actionMessage("изучили", name);
    }

    @Override
    public void learn() {
        Goal goal = new Goal("цель", "новую");
        Messages message = new Messages();
        message.actionMessage("узнали", name);
        message.tempMessage(goal.name, goal.property);
    }

    @Override
    public void entered() {
        Place placeOfTheWorld = new Place("место на земле");
        Messages message = new Messages();
        message.actionMessage("попали", name);
        placeOfTheWorld.describe();
    }

    @Override
    public void belive() {
        Messages message = new Messages();
        message.actionMessage("поверили", name);
        message.endOfSentence(1);
        Highlands highlands = new Highlands("нагорье");
        LengPlateau plateau = new LengPlateau("плато Ленг");
        highlands.describe();
        plateau.describe();
    }
}
