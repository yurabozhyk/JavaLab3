package ua.lviv.iot.zoo.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.zoo.models.*;

public class ZooManagerImpl implements ZooManager {

    private List<AquariumAnimal> listOfAquariumAnimal = new ArrayList<>();

    public void setListOfAquariumAnimal(List<AquariumAnimal> listOfAquariumAnimal) {
        this.listOfAquariumAnimal = listOfAquariumAnimal;
    }

    @Override
    public List<AquariumAnimal> sortBySpeciesOfAnimal(List<AquariumAnimal> listOfAquariumAnimal, boolean reverse) {

        if(reverse) {
            Collections.sort(listOfAquariumAnimal, Comparator.comparing(AquariumAnimal::getSpeciesOfAnimal).reversed());
        } else {
            Collections.sort(listOfAquariumAnimal, Comparator.comparing(AquariumAnimal::getSpeciesOfAnimal));
        }
        return listOfAquariumAnimal;
    }

    @Override
    public List<AquariumAnimal> sortByVolumeOfAquarium(List<AquariumAnimal> listOfAquariumAnimal, boolean reverse) {

        if(reverse) {
            Collections.sort(listOfAquariumAnimal, Comparator.comparing(AquariumAnimal::getVolumeOfAquarium).reversed());
        } else {
            Collections.sort(listOfAquariumAnimal, Comparator.comparing(AquariumAnimal::getVolumeOfAquarium));
        }
        return listOfAquariumAnimal;
    }

    public List<AquariumAnimal> findAquariumAnimalsOlderThan(int yearsCount){
        return listOfAquariumAnimal.stream().filter(animal -> animal.getAge() > yearsCount).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        ZooManager Josh = new ZooManagerImpl();
        AquariumAnimal turtle = new AquariumAnimal("Bobo", 140, 3, Sex.MALE, 400, Species.REPTILE);
        AquariumAnimal shark = new AquariumAnimal("Lilo", 20, 5, Sex.FEMALE, 1000, Species.FISH);
        AquariumAnimal penguin = new AquariumAnimal("Fed", 7, 10, Sex.MALE, 600,Species.BIRDS);

        List<AquariumAnimal> newAquariumAnimalList = new ArrayList<>();
        newAquariumAnimalList.add(turtle);
        newAquariumAnimalList.add(shark);
        newAquariumAnimalList.add(penguin);

        ((ZooManagerImpl) Josh).setListOfAquariumAnimal(newAquariumAnimalList);

        System.out.println(Josh.findAquariumAnimalsOlderThan(5));
        System.out.println(Josh.sortBySpeciesOfAnimal(newAquariumAnimalList, true));
        System.out.println(Josh.sortByVolumeOfAquarium(newAquariumAnimalList, false));

        }
}
