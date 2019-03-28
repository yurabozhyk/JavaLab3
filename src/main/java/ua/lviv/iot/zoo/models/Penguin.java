package ua.lviv.iot.zoo.models;

public class Penguin extends AquariumAnimal {

    private int height;
    private int weight;
    private SpeciesOfPenguin speciesOfPenguin;

    public Penguin() {

    }

    public Penguin(final String nameObj, final int ageObj,
                   final int yearInZooObj, final Sex sexObj,
                   final int volumeOfAquariumObj,
                   final Species speciesOfAnimalObj,
                   final int heightObj, final int weightObj,
                   final SpeciesOfPenguin speciesOfPenguinObj) {
        super(nameObj, ageObj, yearInZooObj, sexObj, volumeOfAquariumObj,
                speciesOfAnimalObj);
        this.height = heightObj;
        this.weight = weightObj;
        this.speciesOfPenguin = speciesOfPenguinObj;
    }

    public final int getHeight() {
        return height;
    }

    public final void setHeight(final int heightObj) {
        this.height = heightObj;
    }

    public final int getWeight() {
        return weight;
    }

    public final void setWeight(final int weightObj) {
        this.weight = weightObj;
    }

    public final SpeciesOfPenguin getSpeciesOfPenguin() {
        return speciesOfPenguin;
    }

    public final void setSpeciesOfPenguin(
            final SpeciesOfPenguin speciesOfPenguinObj) {
        this.speciesOfPenguin = speciesOfPenguinObj;
    }

    @Override
    public final String toString() {
        return "Penguin{"
                + "height="
                + height
                + ", weight="
                + weight
                + ", speciesOfPenguin="
                + speciesOfPenguin
                + '}';
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "height" + ","
                + "weight" + ","
                + "speciesOfPenguin";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + height + ","
                + weight + ","
                + speciesOfPenguin;
    }
}
