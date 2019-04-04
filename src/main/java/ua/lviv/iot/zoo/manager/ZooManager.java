package ua.lviv.iot.zoo.manager;

import java.util.List;

import ua.lviv.iot.zoo.models.AquariumAnimal;

public interface ZooManager {

    List<AquariumAnimal> sortBySpeciesOfAnimal(
            List<AquariumAnimal> listOfAquariumAnimal, boolean reverse);
    List<AquariumAnimal> sortByVolumeOfAquarium(
            List<AquariumAnimal> listOfAquariumAnimal, boolean reverse);
    List<AquariumAnimal> findAquariumAnimalsOlderThan(int yearsCount);

}
