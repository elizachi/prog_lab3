package objects;

import interfaces.MessagesImpl;

public class Mountains extends Objects {

    public Mountains(String name, String properties) {
        super(name, properties);
    }

    public void born(PassiveObjects passiveObject){
        MessagesImpl message = new MessagesImpl();
        message.descriptionMessage(this.getProperties(), "", 0);
        message.actionMessagePasObj("зарождалась на", this.getName(), passiveObject);
    }

    public void cross(PassiveObjects passiveObject){
        MessagesImpl message = new MessagesImpl();
        message.actionMessagePasObj("пересекала", this.getName(), passiveObject);
    }

    public void formed() {
        MessagesImpl message = new MessagesImpl();
        Mountains arch = new Mountains("арку", "величественную");
        message.descriptionMessage(this.getProperties(), "", 0);
        message.actionMessageMount("образует", this.getName(), arch);
    }

}
