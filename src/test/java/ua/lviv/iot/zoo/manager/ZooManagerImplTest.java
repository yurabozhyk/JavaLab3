package ua.lviv.iot.zoo.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.zoo.models.*;

import java.util.ArrayList;
import java.util.List;

public class ZooManagerImplTest {

    @Test
    public void testSortBySpeciesOfAnimal() {
        AquariumAnimal turtle = new Turtle();
        AquariumAnimal shark = new Shark();
        AquariumAnimal penguin = new Penguin();
        ZooManagerImpl testManager = new ZooManagerImpl();

        turtle.setSpeciesOfAnimal(Species.REPTILE);
        shark.setSpeciesOfAnimal(Species.FISH);
        penguin.setSpeciesOfAnimal(Species.BIRDS);

        List<AquariumAnimal> aquariumAnimals = new ArrayList<>();
        List<AquariumAnimal> aquariumAnimalsCheck = new ArrayList<>();

        aquariumAnimals.add(turtle);
        aquariumAnimals.add(shark);
        aquariumAnimals.add(penguin);
        aquariumAnimalsCheck.add(turtle);
        aquariumAnimalsCheck.add(shark);
        aquariumAnimalsCheck.add(penguin);

        Assertions.assertEquals(aquariumAnimalsCheck,
                testManager.sortBySpeciesOfAnimal(aquariumAnimals, true));

    }

    @Test
    public void testSortByVolumeOfAquarium() {
        AquariumAnimal turtle = new Turtle();
        AquariumAnimal shark = new Shark();
        AquariumAnimal penguin = new Penguin();
        ZooManagerImpl testManager = new ZooManagerImpl();

        turtle.setVolumeOfAquarium(400);
        shark.setVolumeOfAquarium(1000);
        penguin.setVolumeOfAquarium(600);

        List<AquariumAnimal> aquariumAnimals = new ArrayList<>();
        List<AquariumAnimal> aquariumAnimalsCheck = new ArrayList<>();

        aquariumAnimals.add(turtle);
        aquariumAnimals.add(shark);
        aquariumAnimals.add(penguin);
        aquariumAnimalsCheck.add(turtle);
        aquariumAnimalsCheck.add(shark);
        aquariumAnimalsCheck.add(penguin);

        Assertions.assertEquals(aquariumAnimalsCheck,
                testManager.sortByVolumeOfAquarium(aquariumAnimals, true));
    }

    @Test
    public void testFindAquariumAnimalsOlderThan(int yearsCount) {
        AquariumAnimal turtle = new Turtle();
        AquariumAnimal shark = new Shark();
        AquariumAnimal penguin = new Penguin();
        ZooManagerImpl testManager = new ZooManagerImpl();

        turtle.setAge(150);
        shark.setAge(25);
        penguin.setAge(4);

        List<AquariumAnimal> aquariumAnimals = new ArrayList<>();
        List<AquariumAnimal> aquariumAnimalsCheck = new ArrayList<>();

        aquariumAnimals.add(turtle);
        aquariumAnimals.add(shark);
        aquariumAnimals.add(penguin);
        aquariumAnimalsCheck.add(turtle);
        aquariumAnimalsCheck.add(shark);
        aquariumAnimalsCheck.add(penguin);

        testManager.setListOfAquariumAnimal(aquariumAnimals);
        Assertions.assertEquals(aquariumAnimalsCheck,
                testManager.findAquariumAnimalsOlderThan(yearsCount));

    }

}

