package service;

import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;

// Класс, использующий интерфейс Messages для генерации сообщений и вывода их на консоль
public class MessagesImpl implements Messages {

    // Выводит поясняющее сообщение в формате: описание объекта + имя объекта или просто имя объекта
    @Override
    public void descriptionMessage(String properties, String name, int flag){
        System.out.print(properties + " ");
        if(flag == 1){
            System.out.print(name + " ");
        }
    }

    // Выводит сообщение с совершением действия активного объекта над пассивным объектом в формате:
    // описание активного объекта + имя активного объекта + действие + описание пассивного объекта + имя пассивного объекта
    @Override
    public void actionMessage(String action, Object activeObject, PassiveObjects namePassiveObject){
        System.out.print(activeObject + " " + action + " ");
        descriptionMessage(namePassiveObject.getProperties(), namePassiveObject.getName(), 1);
    }

    // Выводит сообщение с совершением действия активного объекта над горным объектом в формате:
    // описание активного объекта + имя активного объекта + действие + описание горного объекта + имя горного объект
    @Override
    public void actionMessage(String action, Object activeObject, Mountains mountains) {
        System.out.print(activeObject + " " + action + " ");
        descriptionMessage(mountains.getProperties(), mountains.getName(), 1);
    }

    // Метод для постановки знака препинания
    @Override
    public void endOfSentence(int number){
        if(number == 0){
            System.out.print(".\n");
        } else if(number == 1){
            System.out.print(": ");
        }

    }

    // Метод для предоставления информации о классе в виде строки
    @Override
    public String toString(){
        return "class: MessagesImpl\n" + "description: класс реализует генерацию сообщений для вывода на консоль. " +
                "Применяется в методах других классов.";
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
