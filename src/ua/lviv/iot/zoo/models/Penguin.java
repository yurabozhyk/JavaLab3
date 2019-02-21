package ua.lviv.iot.zoo.models;

public class Penguin extends AquariumAnimal {

    private int height;
    private int weight;
    private SpeciesOfPenguin speciesOfPenguin;

    public Penguin() {

    }

    public Penguin(int height, int weight, SpeciesOfPenguin speciesOfPenguin) {
        this.height = height;
        this.weight = weight;
        this.speciesOfPenguin = speciesOfPenguin;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public SpeciesOfPenguin getSpeciesOfPenguin() {
        return speciesOfPenguin;
    }

    public void setSpeciesOfPenguin(SpeciesOfPenguin speciesOfPenguin) {
        this.speciesOfPenguin = speciesOfPenguin;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "height=" + height +
                ", weight=" + weight +
                ", speciesOfPenguin=" + speciesOfPenguin +
                '}';
    }
}
