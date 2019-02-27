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
                "Bobo", 140, 3, Sex.MALE, 400, Species.REPTILE);
        AquariumAnimal shark = new AquariumAnimal(
                "Lilo", 20, 5, Sex.FEMALE, 1000, Species.FISH);
        AquariumAnimal penguin = new AquariumAnimal(
                "Fed", 7, 10, Sex.MALE, 600, Species.BIRDS);

        List<AquariumAnimal> newAquariumAnimalList = new ArrayList<>();
        newAquariumAnimalList.add(turtle);
        newAquariumAnimalList.add(shark);
        newAquariumAnimalList.add(penguin);

        ((ZooManagerImpl) josh).setListOfAquariumAnimal(newAquariumAnimalList);

        System.out.println(josh.findAquariumAnimalsOlderThan(5));
        System.out.println(josh.sortBySpeciesOfAnimal(
                newAquariumAnimalList, true));
        System.out.println(josh.sortByVolumeOfAquarium(
                newAquariumAnimalList, false));

        }
}
