package objects;

import interfaces.MessagesImpl;
import locations.Continent;
import locations.LandWedlaSea;

public class MountainRange extends SimpleObject{

    public MountainRange(String name, String property) {
        super(name, property);
    }

    public void originate(){
        MessagesImpl message = new MessagesImpl();
        LandWedlaSea land = new LandWedlaSea("Земле у моря Уэдделла");
        message.simpleObjectMessage(this.getName(), "Грандиозная горная");
        message.actionMessage("зарождалась", "");
        message.simpleObjectMessage(land.getName(), "");
    }

    public void intersect(){
        MessagesImpl message = new MessagesImpl();
        Continent continent = new Continent("континент");
        message.actionMessage("пересекала", this.getName());
        continent.describe();
    }
}
