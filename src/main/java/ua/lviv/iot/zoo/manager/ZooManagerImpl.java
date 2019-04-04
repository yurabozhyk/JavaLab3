package ua.lviv.iot.zoo.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.zoo.models.AquariumAnimal;
import ua.lviv.iot.zoo.models.Sex;
import ua.lviv.iot.zoo.models.Species;

public class ZooManagerImpl implements ZooManager {

    private static final int TURTLE_AGE = 140;
    private static final int TURTLE_YEARS_IN_ZOO = 3;
    private static final int TURTLE_VOLUME_OF_AQUARIUM = 400;
    private static final int SHARK_AGE = 20;
    private static final int SHARK_YEARS_IN_ZOO = 5;
    private static final int SHARK_VOLUME_OF_AQUARIUM = 1000;
    private static final int PENGUIN_AGE = 7;
    private static final int PENGUIN_YEARS_IN_ZOO = 10;
    private static final int PENGUIN_VOLUME_OF_AQUARIUM = 600;
    private static final int AGE_PARAM = 5;

    private List<AquariumAnimal> listOfAquariumAnimal = new ArrayList<>();

    public final void setListOfAquariumAnimal(
           final List<AquariumAnimal> listOfAquariumAnimalObj) {
        this.listOfAquariumAnimal = listOfAquariumAnimalObj;
    }

    @Override
    public final List<AquariumAnimal> sortBySpeciesOfAnimal(
           final List<AquariumAnimal> listOfAquariumAnimalObj,
           final boolean reverse) {

        if (reverse) {
            Collections.sort(
                    listOfAquariumAnimalObj, Comparator.comparing(
                            AquariumAnimal::getSpeciesOfAnimal).reversed());
        } else {
            Collections.sort(
                    listOfAquariumAnimalObj, Comparator.comparing(
                            AquariumAnimal::getSpeciesOfAnimal));
        }
        return listOfAquariumAnimalObj;
    }

    @Override
    public final List<AquariumAnimal> sortByVolumeOfAquarium(
           final List<AquariumAnimal> listOfAquariumAnimalObj,
           final boolean reverse) {

        if (reverse) {
            Collections.sort(
                    listOfAquariumAnimalObj, Comparator.comparing(
                            AquariumAnimal::getVolumeOfAquarium).reversed());
        } else {
            Collections.sort(
                    listOfAquariumAnimalObj, Comparator.comparing(
                            AquariumAnimal::getVolumeOfAquarium));
        }
        return listOfAquariumAnimalObj;
    }

    public final List<AquariumAnimal> findAquariumAnimalsOlderThan(
            final int yearsCount) {
        return listOfAquariumAnimal.stream().filter(animal ->
                animal.getAge() > yearsCount).collect(Collectors.toList());
    }

    public static void main(final String[] args) {

        ZooManager josh = new ZooManagerImpl();
        AquariumAnimal turtle = new AquariumAnimal(
                "Bobo", TURTLE_AGE, TURTLE_YEARS_IN_ZOO, Sex.MALE,
                TURTLE_VOLUME_OF_AQUARIUM,
                Species.REPTILE);
        AquariumAnimal shark = new AquariumAnimal(
                "Lilo", SHARK_AGE, SHARK_YEARS_IN_ZOO, Sex.FEMALE,
                SHARK_VOLUME_OF_AQUARIUM,
                Species.FISH);
        AquariumAnimal penguin = new AquariumAnimal(
                "Fed", PENGUIN_AGE, PENGUIN_YEARS_IN_ZOO, Sex.MALE,
                PENGUIN_VOLUME_OF_AQUARIUM,
                Species.BIRDS);

        List<AquariumAnimal> newAquariumAnimalList = new ArrayList<>();
        newAquariumAnimalList.add(turtle);
        newAquariumAnimalList.add(shark);
        newAquariumAnimalList.add(penguin);

        ((ZooManagerImpl) josh).setListOfAquariumAnimal(newAquariumAnimalList);

        System.out.println(josh.findAquariumAnimalsOlderThan(AGE_PARAM));
        System.out.println(josh.sortBySpeciesOfAnimal(
                newAquariumAnimalList, true));
        System.out.println(josh.sortByVolumeOfAquarium(
                newAquariumAnimalList, false));

        }
}
