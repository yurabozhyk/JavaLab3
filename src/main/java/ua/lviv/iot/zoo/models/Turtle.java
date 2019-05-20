package ua.lviv.iot.zoo.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Turtle extends AquariumAnimal {

    private Shell shell;
    private int immersionDepth;

    public Turtle() {

    }

    public Turtle(final String nameObj, final int ageObj,
                  final int yearInZooObj, final Sex sexObj,
                  final int volumeOfAquariumObj,
                  final Species speciesOfAnimalObj, final Shell shellObj,
                  final int immersionDepthObj) {
        super(nameObj, ageObj, yearInZooObj, sexObj, volumeOfAquariumObj,
                speciesOfAnimalObj);
        this.shell = shellObj;
        this.immersionDepth = immersionDepthObj;
    }

    public final Shell getShell() {
        return shell;
    }

    public final void setShell(final Shell shellObj) {
        this.shell = shellObj;
    }

    public final int getImmersionDepth() {
        return immersionDepth;
    }

    public final void setImmersionDepth(final int immersionDepthObj) {
        this.immersionDepth = immersionDepthObj;
    }

    @Override
    public final String toString() {
        return "Turtle{"
                + "shell="
                + shell
                + ", immersionDepth="
                + immersionDepth
                + '}';
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "shell" + ","
                + "immersionDepth";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + shell + ","
                + immersionDepth;
    }
}
