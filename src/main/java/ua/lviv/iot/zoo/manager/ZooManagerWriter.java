package ua.lviv.iot.zoo.manager;

import ua.lviv.iot.zoo.models.AquariumAnimal;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class ZooManagerWriter {

    private String filePath;

    ZooManagerWriter() {

    }

    ZooManagerWriter(final String filePathObj) {
        this.filePath = filePathObj;
    }

    public final void writeToFile(
            final List<AquariumAnimal> listOfAquariumAnimal)  {
        File myFile = new File(filePath + ".csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
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
        }
    }

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(final String filePathObj) {
        this.filePath = filePathObj;
    }
}
