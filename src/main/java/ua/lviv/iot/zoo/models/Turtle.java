package ua.lviv.iot.zoo.models;

public class Turtle extends AquariumAnimal {

    private Shell shell;
    private int immersionDepth;

    public Turtle() {

    }

    public Turtle(String nameObj, int ageObj, int yearInZooObj, Sex sexObj, int volumeOfAquariumObj, Species speciesOfAnimalObj, Shell shell, int immersionDepth) {
        super(nameObj, ageObj, yearInZooObj, sexObj, volumeOfAquariumObj, speciesOfAnimalObj);
        this.shell = shell;
        this.immersionDepth = immersionDepth;
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
}
