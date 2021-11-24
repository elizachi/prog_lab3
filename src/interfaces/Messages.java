package interfaces;

public interface Messages {
    void descriptionMessage(String[] words, int length, String name);
    void actionMessage(String action, String name);
    void endOfSentence(int number);
    void tempMessage(String name, String property);
}
