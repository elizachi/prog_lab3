package interfaces;

public class MessagesImpl implements Messages{
    public void descriptionMessage(String [] words, int length, String name, int flag){
        for(int i = 0; i < length; i++){
            System.out.print(words[i] + " ");
        }
        if(flag == 1){
            System.out.print(name + " ");
        }
    }
    public void actionMessage(String action, String name){
        System.out.print(name + " ");
        System.out.print(action + " ");
    }
    public void endOfSentence(int number){
        if(number == 0){
            System.out.print(".\n");
        } else if(number == 1){
            System.out.print(": ");
        }

    }
    public void simpleObjectMessage(String name, String property){
        System.out.print(property + " ");
        System.out.print(name + " ");
    }
}
