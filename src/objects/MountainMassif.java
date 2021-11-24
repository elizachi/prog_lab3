package objects;

import interfaces.MessagesImpl;

public class MountainMassif extends SimpleObject{

    public MountainMassif(String name, String property) {
        super(name, property);
    }

    public void build(){
        MessagesImpl message = new MessagesImpl();
        Arch arch = new Arch("арку", "величественную");
        message.simpleObjectMessage("", this.getProperty());
        message.actionMessage("образует", this.getName());
        message.simpleObjectMessage(arch.getName(), arch.getProperty());
    }
}
