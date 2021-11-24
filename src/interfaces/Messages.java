package interfaces;

public interface Messages {
    void descriptionMessage(String[] words, int length, String name, int flag);
    void actionMessage(String action, String name);
    void endOfSentence(int number);
    void simpleObjectMessage(String name, String property);
}
