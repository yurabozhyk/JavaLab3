package ua.lviv.iot.zoo.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.zoo.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ZooManagerWriterTest {

    private List<AquariumAnimal> listOfAquariumAnimal = new LinkedList<>();

    @BeforeEach
    public void setUp() {
        listOfAquariumAnimal.add(new Turtle("Jojo", 450, 40, Sex.MALE, 2000,
                Species.REPTILE, Shell.BROWN_PATTERN, 10000));
        listOfAquariumAnimal.add(new Penguin("Obem", 22, 10, Sex.MALE, 600,
                Species.BIRDS, 45, 40, SpeciesOfPenguin.MAGELLANIC));
        listOfAquariumAnimal.add(new Shark("Bebe", 30, 23, Sex.FEMALE, 2500,
                Species.FISH, SpeciesOfSharks.BLUE, 100, SwimType.IN_GROUPS));
    }

    @Test
    void testWriteToFile() {
        File myFile = new File("writer.csv");

        ZooManagerWriter writer = new ZooManagerWriter();
        writer.writeToFile(listOfAquariumAnimal);

        try(FileInputStream fis = new FileInputStream(myFile);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr)) {

            for (AquariumAnimal aquariumAnimal : listOfAquariumAnimal) {
                assertEquals(aquariumAnimal.getHeaders(), reader.readLine());
                assertEquals(aquariumAnimal.toCSV(), reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Reading ended");
        }
    }
}
