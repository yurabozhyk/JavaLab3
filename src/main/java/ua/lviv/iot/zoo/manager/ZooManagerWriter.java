package ua.lviv.iot.zoo.manager;

import ua.lviv.iot.zoo.models.AquariumAnimal;

import java.io.*;
import java.util.List;

public class ZooManagerWriter {

    public void writeToFile(List<AquariumAnimal> listOfAquariumAnimal)  {
        File myFile = new File("writer.csv");

        try(FileOutputStream fos = new FileOutputStream(myFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (AquariumAnimal aquariumAnimal : listOfAquariumAnimal) {
                bufWriter.write(aquariumAnimal.getHeaders());
                bufWriter.newLine();
                bufWriter.write(aquariumAnimal.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("File has been written");
        }
    }
}
