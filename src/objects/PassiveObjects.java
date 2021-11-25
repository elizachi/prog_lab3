package objects;

import interfaces.MessagesImpl;

public class PassiveObjects extends Objects {

    public PassiveObjects(String name, String properties) {
        super(name, properties);
    }

    public String getName() {
        return super.getName();
    }

}
