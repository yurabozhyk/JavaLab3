package ua.lviv.iot.zoo.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.zoo.models.*;

import static org.junit.jupiter.api.Assertions.*;


import java.util.LinkedList;
import java.util.List;

class ZooManagerImplTest {

    private List<AquariumAnimal> listOfAquariumAnimals;

    private ZooManager zooManager;

    @Test
    public void testSortBySpeciesOfAnimal() {
        listOfAquariumAnimals = new LinkedList<>();


        Turtle turtle = new Turtle("Bob", 250, 30, Sex.MALE,
                700,
                Species.REPTILE, Shell.GREEN_PATTERN, 20000);
        turtle.setSpeciesOfAnimal(Species.REPTILE);

        Shark shark = new Shark("Lolo", 45, 10,
                Sex.FEMALE,
                1500,
                Species.FISH, SpeciesOfSharks.HAMMERHEAD, 240, SwimType.ALONE);
        shark.setSpeciesOfAnimal(Species.FISH);

        Penguin penguin = new Penguin("Fed", 2, 1, Sex.MALE,
                600,
                Species.BIRDS, 30, 20, SpeciesOfPenguin.FAIRY);
        penguin.setSpeciesOfAnimal(Species.BIRDS);

        List<AquariumAnimal> expectedList = new LinkedList<>();

        listOfAquariumAnimals.add(shark);
        listOfAquariumAnimals.add(turtle);
        listOfAquariumAnimals.add(penguin);

        zooManager = new ZooManagerImpl(listOfAquariumAnimals);

        expectedList.add(shark);
        expectedList.add(turtle);
        expectedList.add(penguin);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, false);
        assertEquals(expectedList, listOfAquariumAnimals);

        expectedList = new LinkedList<>();

        expectedList.add(penguin);
        expectedList.add(turtle);
        expectedList.add(shark);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, true);
        assertEquals(expectedList, listOfAquariumAnimals);
    }

    @Test
    public void testSortByVolumeOfAquarium() {
        listOfAquariumAnimals = new LinkedList<>();


        Turtle turtle = new Turtle("Bob", 250, 30, Sex.MALE,
                700,
                Species.REPTILE, Shell.GREEN_PATTERN, 20000);
        turtle.setVolumeOfAquarium(800);

        Shark shark = new Shark("Lolo", 45, 10,
                Sex.FEMALE,
                1500,
                Species.FISH, SpeciesOfSharks.HAMMERHEAD, 240, SwimType.ALONE);
        shark.setVolumeOfAquarium(1400);

        Penguin penguin = new Penguin("Fed", 2, 1, Sex.MALE,
                600,
                Species.BIRDS, 30, 20, SpeciesOfPenguin.FAIRY);
        penguin.setVolumeOfAquarium(400);

        List<AquariumAnimal> expectedList = new LinkedList<>();

        listOfAquariumAnimals.add(shark);
        listOfAquariumAnimals.add(turtle);
        listOfAquariumAnimals.add(penguin);

        zooManager = new ZooManagerImpl(listOfAquariumAnimals);

        expectedList.add(shark);
        expectedList.add(turtle);
        expectedList.add(penguin);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, false);
        assertEquals(expectedList, listOfAquariumAnimals);

        expectedList = new LinkedList<>();

        expectedList.add(penguin);
        expectedList.add(turtle);
        expectedList.add(shark);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, true);
        assertEquals(expectedList, listOfAquariumAnimals);
    }
}
//
//    @Test
//    public void testFindAquariumAnimalsOlderThan(int yearsCount) {
//        AquariumAnimal turtle = new Turtle();
//        AquariumAnimal shark = new Shark();
//        AquariumAnimal penguin = new Penguin();
//        ZooManagerImpl testManager = new ZooManagerImpl();
//
//        turtle.setAge(150);
//        shark.setAge(25);
//        penguin.setAge(4);
//
//        List<AquariumAnimal> aquariumAnimals = new ArrayList<>();
//        List<AquariumAnimal> aquariumAnimalsCheck = new ArrayList<>();
//
//        aquariumAnimals.add(turtle);
//        aquariumAnimals.add(shark);
//        aquariumAnimals.add(penguin);
//        aquariumAnimalsCheck.add(turtle);
//        aquariumAnimalsCheck.add(shark);
//        aquariumAnimalsCheck.add(penguin);
//
//        testManager.setListOfAquariumAnimal(aquariumAnimals);
//        Assertions.assertEquals(aquariumAnimalsCheck,
//                testManager.findAquariumAnimalsOlderThan(yearsCount));
//
//    }
//
//}
//
