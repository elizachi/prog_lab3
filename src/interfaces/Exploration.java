package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

// Интерфейс с методами для реализации исследоавния местности персонажами.
public interface Exploration {
    void raid(PassiveObjects passiveObject); //облазили и изучили
    void learn(PassiveObjects passiveObject); //узнали
    void entered(Mountains passiveObject); //попали
    void belive(Mountains passiveObject); //поверили
}
