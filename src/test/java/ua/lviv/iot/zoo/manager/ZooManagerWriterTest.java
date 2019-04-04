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
    ZooManagerWriter writer = new ZooManagerWriter();
    private String filePath = "myFile";

    private Turtle turtle = new Turtle("Jojo", 450, 40, Sex.MALE, 2000,
            Species.REPTILE, Shell.BROWN_PATTERN, 10000);
    private Penguin penguin = new Penguin("Obem", 22, 10, Sex.MALE, 600,
            Species.BIRDS, 45, 40, SpeciesOfPenguin.MAGELLANIC);
    private Shark shark = new Shark("Bebe", 30, 23, Sex.FEMALE, 2500,
            Species.FISH, SpeciesOfSharks.BLUE, 100, SwimType.IN_GROUPS);

    @BeforeEach
    public void setUp() {
        listOfAquariumAnimal.add(turtle);
        listOfAquariumAnimal.add(penguin);
        listOfAquariumAnimal.add(shark);

        writer = new ZooManagerWriter(filePath);
    }

    @Test
    void testWriteToFile() {
        File myFile = new File(filePath + ".csv");
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
        }
    }

    @Test
    void testGettersAndSettersFilePath() {
        writer.setFilePath(filePath);
        assertEquals(filePath, writer.getFilePath(),
                "Getter or Setter method failed");
    }
}
