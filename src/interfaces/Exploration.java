package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public interface Exploration {
    void raid(PassiveObjects passiveObject); //облазили и изучили
    void learn(PassiveObjects passiveObject); //узнали
    void entered(Mountains passiveObject); //попали
    void belive(Mountains passiveObject); //поверили
}
