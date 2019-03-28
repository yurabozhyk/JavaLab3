package ua.lviv.iot.zoo.manager;

import org.junit.jupiter.api.BeforeEach;
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
    private List<AquariumAnimal> expectedList;

    private ZooManager zooManager;

    private AquariumAnimal shark;
    private AquariumAnimal turtle;
    private AquariumAnimal penguin;


    @BeforeEach
    public void setUp() {
        listOfAquariumAnimals = new LinkedList<>();

        turtle = new Turtle();
        turtle.setSpeciesOfAnimal(Species.REPTILE);
        turtle.setVolumeOfAquarium(3000);
        turtle.setAge(150);

        shark = new Shark();
        shark.setSpeciesOfAnimal(Species.FISH);
        shark.setVolumeOfAquarium(2000);
        shark.setAge(12);

        penguin = new Penguin();
        penguin.setSpeciesOfAnimal(Species.BIRDS);
        penguin.setVolumeOfAquarium(1000);
        penguin.setAge(4);

        expectedList = new LinkedList<>();

        listOfAquariumAnimals.add(turtle);
        listOfAquariumAnimals.add(shark);
        listOfAquariumAnimals.add(penguin);

        zooManager = new ZooManagerImpl(listOfAquariumAnimals);

    }

    @Test
    public void testSortBySpeciesOfAnimal() {

        expectedList.add(shark);
        expectedList.add(turtle);
        expectedList.add(penguin);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, false);
        assertEquals(expectedList, listOfAquariumAnimals);

        expectedList.clear();

        expectedList.add(penguin);
        expectedList.add(turtle);
        expectedList.add(shark);

        zooManager.sortBySpeciesOfAnimal(listOfAquariumAnimals, true);
        assertEquals(expectedList, listOfAquariumAnimals);
    }

    @Test
    public void testSortByVolumeOfAquarium() {

        expectedList.add(penguin);
        expectedList.add(shark);
        expectedList.add(turtle);

        zooManager.sortByVolumeOfAquarium(listOfAquariumAnimals, false);
        assertEquals(expectedList, listOfAquariumAnimals);

        expectedList.clear();

        expectedList.add(turtle);
        expectedList.add(shark);
        expectedList.add(penguin);

        zooManager.sortByVolumeOfAquarium(listOfAquariumAnimals, true);
        assertEquals(expectedList, listOfAquariumAnimals);
    }

    @Test
    public void testFindAquariumAnimalsOlderThan() {

        expectedList.add(turtle);
        expectedList.add(shark);
        expectedList.add(penguin);

        assertEquals(0, zooManager.findAquariumAnimalsOlderThan(200).size());
        assertEquals(1, zooManager.findAquariumAnimalsOlderThan(20).size());
        assertEquals(2, zooManager.findAquariumAnimalsOlderThan(5).size());
        assertEquals(3, zooManager.findAquariumAnimalsOlderThan(2).size());
    }

}

