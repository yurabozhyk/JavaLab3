package ua.lviv.iot.zoo.models;

public class Shark extends AquariumAnimal {

    private SpeciesOfSharks speciesOfSharks;
    private int speed;
    private SwimType swimmingType;

    public Shark(){

    }

    public Shark(SpeciesOfSharks speciesOfSharks, int speed, SwimType swimmingType) {
        this.speciesOfSharks = speciesOfSharks;
        this.speed = speed;
        this.swimmingType = swimmingType;
    }

    public SpeciesOfSharks getSpeciesOfSharks() {
        return speciesOfSharks;
    }

    public void setSpeciesOfSharks(SpeciesOfSharks speciesOfSharks) {
        this.speciesOfSharks = speciesOfSharks;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SwimType getSwimmingType() {
        return swimmingType;
    }

    public void setSwimmingType(SwimType swimmingType) {
        this.swimmingType = swimmingType;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "speciesOfSharks=" + speciesOfSharks +
                ", speed=" + speed +
                ", swimmingType=" + swimmingType +
                '}';
    }
}
