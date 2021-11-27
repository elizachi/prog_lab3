package interfaces;

import objects.PassiveObjects;

public interface Exploration {
    void raid(PassiveObjects passiveObject); //облазили и изучили
    void learn(PassiveObjects passiveObject); //узнали
    void entered(PassiveObjects passiveObject); //попали
    void belive(PassiveObjects passiveObject); //поверили
}
