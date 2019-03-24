package ua.lviv.iot.zoo.manager;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.zoo.models.AquariumAnimal;
import ua.lviv.iot.zoo.models.Shark;
import ua.lviv.iot.zoo.models.Penguin;
import ua.lviv.iot.zoo.models.Species;
import ua.lviv.iot.zoo.models.Turtle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

class ZooManagerImplTest {

    private List<AquariumAnimal> listOfAquariumAnimals;

    private ZooManager zooManager;

    @Test
    public void testSortBySpeciesOfAnimal() {
        listOfAquariumAnimals = new LinkedList<>();

        Turtle turtle = new Turtle();
        turtle.setSpeciesOfAnimal(Species.REPTILE);

        Shark shark = new Shark();
        shark.setSpeciesOfAnimal(Species.FISH);
        Penguin penguin = new Penguin();
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

        Turtle turtle = new Turtle();
        turtle.setVolumeOfAquarium(800);

        Shark shark = new Shark();
        shark.setVolumeOfAquarium(1400);

        Penguin penguin = new Penguin();
        penguin.setVolumeOfAquarium(400);

        List<AquariumAnimal> expectedList = new LinkedList<>();

        listOfAquariumAnimals.add(turtle);
        listOfAquariumAnimals.add(shark);
        listOfAquariumAnimals.add(penguin);

        zooManager = new ZooManagerImpl(listOfAquariumAnimals);

        expectedList.add(penguin);
        expectedList.add(turtle);
        expectedList.add(shark);

        zooManager.sortByVolumeOfAquarium(listOfAquariumAnimals, false);
        assertEquals(expectedList, listOfAquariumAnimals);

        expectedList = new LinkedList<>();

        expectedList.add(shark);
        expectedList.add(turtle);
        expectedList.add(penguin);

        zooManager.sortByVolumeOfAquarium(listOfAquariumAnimals, true);
        assertEquals(expectedList, listOfAquariumAnimals);
    }

    @Test
    public void testFindAquariumAnimalsOlderThan() {
        listOfAquariumAnimals = new LinkedList<>();

        Turtle turtle = new Turtle();
        turtle.setAge(150);

        Shark shark = new Shark();
        shark.setAge(12);

        Penguin penguin = new Penguin();
        penguin.setAge(4);

        List<AquariumAnimal> expectedList = new LinkedList<>();

        listOfAquariumAnimals.add(penguin);
        listOfAquariumAnimals.add(shark);
        listOfAquariumAnimals.add(turtle);

        zooManager = new ZooManagerImpl(listOfAquariumAnimals);

        expectedList.add(shark);
        expectedList.add(penguin);
        expectedList.add(turtle);

        assertEquals(0, zooManager.findAquariumAnimalsOlderThan(200).size());
        assertEquals(1, zooManager.findAquariumAnimalsOlderThan(20).size());
        assertEquals(2, zooManager.findAquariumAnimalsOlderThan(5).size());
        assertEquals(3, zooManager.findAquariumAnimalsOlderThan(2).size());
    }

}

