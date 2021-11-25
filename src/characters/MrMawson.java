package characters;

import interfaces.Exploration;
import interfaces.MessagesImpl;
import objects.Mountains;
import objects.PassiveObjects;

public class MrMawson extends Character implements Exploration {
    public MrMawson(String name) {
        super(name);
    }

    @Override
    public void see(Mountains mountains) {
        MessagesImpl message = new MessagesImpl();
        message.actionMessageMount("видел", this.getName(), mountains);
    }

    @Override
    public void raid(PassiveObjects passiveObject) {

    }

    @Override
    public void learn(PassiveObjects passiveObject) {

    }

    @Override
    public void entered(PassiveObjects passiveObject) {

    }

    @Override
    public void belive(PassiveObjects passiveObject) {

    }
}
