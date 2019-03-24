package ua.lviv.iot.zoo.manager;

import java.util.List;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.stream.Collectors;

import ua.lviv.iot.zoo.models.Sex;
import ua.lviv.iot.zoo.models.Shark;
import ua.lviv.iot.zoo.models.Shell;
import ua.lviv.iot.zoo.models.Turtle;
import ua.lviv.iot.zoo.models.Penguin;
import ua.lviv.iot.zoo.models.Species;
import ua.lviv.iot.zoo.models.SwimType;
import ua.lviv.iot.zoo.models.AquariumAnimal;
import ua.lviv.iot.zoo.models.SpeciesOfSharks;
import ua.lviv.iot.zoo.models.SpeciesOfPenguin;


public class ZooManagerImpl implements ZooManager {

    private static final int TURTLE_AGE = 140;
    private static final int TURTLE_YEARS_IN_ZOO = 3;
    private static final int TURTLE_VOLUME_OF_AQUARIUM = 400;
    private static final int TURTLE_IMMERSION_DEPTH = 30000;
    private static final int SHARK_AGE = 20;
    private static final int SHARK_YEARS_IN_ZOO = 5;
    private static final int SHARK_VOLUME_OF_AQUARIUM = 1000;
    private static final int SHARK_SPEED = 200;
    private static final int PENGUIN_AGE = 3;
    private static final int PENGUIN_YEARS_IN_ZOO = 10;
    private static final int PENGUIN_VOLUME_OF_AQUARIUM = 600;
    private static final int PENGUIN_HEIGHT = 60;
    private static final int PENGUIN_WEIGHT = 50;
    private static final int AGE_PARAM = 5;

    private List<AquariumAnimal> listOfAquariumAnimal = new LinkedList<>();

    public ZooManagerImpl() {

    }

    public ZooManagerImpl(final List<AquariumAnimal> listOfAquariumAnimals) {
        this.listOfAquariumAnimal = listOfAquariumAnimals;
    }

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
        AquariumAnimal turtle = new Turtle("Bobo", TURTLE_AGE,
                TURTLE_YEARS_IN_ZOO, Sex.MALE, TURTLE_VOLUME_OF_AQUARIUM,
                Species.REPTILE, Shell.GREEN_PATTERN, TURTLE_IMMERSION_DEPTH);
        AquariumAnimal shark = new Shark(
                "Lilo", SHARK_AGE, SHARK_YEARS_IN_ZOO, Sex.FEMALE,
                SHARK_VOLUME_OF_AQUARIUM, Species.FISH,
                SpeciesOfSharks.TIGER, SHARK_SPEED, SwimType.IN_GROUPS);
        AquariumAnimal penguin = new Penguin(
                "Fed", PENGUIN_AGE, PENGUIN_YEARS_IN_ZOO, Sex.MALE,
                PENGUIN_VOLUME_OF_AQUARIUM, Species.BIRDS, PENGUIN_HEIGHT,
                PENGUIN_WEIGHT, SpeciesOfPenguin.KING);

        List<AquariumAnimal> newAquariumAnimalList = new LinkedList<>();
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
