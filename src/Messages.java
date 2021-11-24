public class Messages {
    void descriptionMessage(String [] words, int length, String name){
        for(int i = 0; i < length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.print(name + " ");
    }
    void actionMessage(String action, String name){
        System.out.print(name + " ");
        System.out.print(action + " ");
    }
    void endOfSentence(int number){
        if(number == 0){
            System.out.print(".\n");
        } else if(number == 1){
            System.out.print(": ");
        }

    }
    void tempMessage(String name, String property){
        System.out.print(property + " ");
        System.out.print(name + " ");
    }
}
