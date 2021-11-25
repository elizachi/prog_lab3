package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public interface Messages {
    void descriptionMessage(String properties, String name, int flag);
    void actionMessagePasObj(String action, Object nameActiveObject, PassiveObjects namePassiveObject);
    void endOfSentence(int number);
    void actionMessageMount(String action, Object nameActiveObject, Mountains mountains);
}
