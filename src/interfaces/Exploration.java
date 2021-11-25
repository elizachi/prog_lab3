package interfaces;

import objects.Mountains;
import objects.PassiveObjects;

public interface Exploration {
    void raid(PassiveObjects passiveObject); //облазили и изучили
    void learn(PassiveObjects passiveObject); //узнали
    void entered(PassiveObjects passiveObject); //попали
    void belive(PassiveObjects passiveObject); //поверили
    void see(Mountains mountains); //видели
}
