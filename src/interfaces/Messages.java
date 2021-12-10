package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

// Интерфейс для хорошей реализации вывода сообщений через один класс
public interface Messages {
    // Выводит поясняющее сообщение в формате: описание объекта + имя объекта или просто имя объекта
    void descriptionMessage(String properties, String name, int flag);
    // Выводит сообщение с совершением действия активного объекта над пассивным объектом в формате:
    // описание активного объекта + имя активного объекта + действие + описание пассивного объекта + имя пассивного объекта
    void actionMessage(String action, Object activeObject, PassiveObjects namePassiveObject);
    // Метод для постановки знака препинания
    void endOfSentence(int number);
    // Выводит сообщение с совершением действия активного объекта над горным объектом в формате:
    // описание активного объекта + имя активного объекта + действие + описание горного объекта + имя горного объекта
    void actionMessage(String action, Object activeObject, Mountains mountains);
}
