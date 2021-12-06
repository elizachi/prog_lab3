package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public interface Messages {
    void descriptionMessage(String properties, String name, int flag);
    void actionMessage(String action, Object activeObject, PassiveObjects namePassiveObject);
    void endOfSentence(int number);
    void actionMessage(String action, Object activeObject, Mountains mountains);
}
