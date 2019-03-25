package ua.lviv.iot.zoo.models;

public class Shark extends AquariumAnimal {

    private SpeciesOfSharks speciesOfSharks;
    private int speed;
    private SwimType swimmingType;

    public Shark() {

    }

    public Shark(final String nameObj, final int ageObj, final int yearInZooObj,
                 final Sex sexObj, final int volumeOfAquariumObj,
                 final Species speciesOfAnimalObj,
                 final SpeciesOfSharks speciesOfSharksObj, final int speedObj,
                 final SwimType swimmingTypeObj) {
        super(nameObj, ageObj, yearInZooObj, sexObj, volumeOfAquariumObj,
                speciesOfAnimalObj);
        this.speciesOfSharks = speciesOfSharksObj;
        this.speed = speedObj;
        this.swimmingType = swimmingTypeObj;
    }

    public final SpeciesOfSharks getSpeciesOfSharks() {
        return speciesOfSharks;
    }

    public final void setSpeciesOfSharks(
            final SpeciesOfSharks speciesOfSharksObj) {
        this.speciesOfSharks = speciesOfSharksObj;
    }

    public final int getSpeed() {
        return speed;
    }

    public final void setSpeed(final int speedObj) {
        this.speed = speedObj;
    }

    public final SwimType getSwimmingType() {
        return swimmingType;
    }

    public final void setSwimmingType(final SwimType swimmingTypeObj) {
        this.swimmingType = swimmingTypeObj;
    }

    @Override
    public final String toString() {
        return "Shark{"
                + "speciesOfSharks="
                + speciesOfSharks
                + ", speed="
                + speed
                + ", swimmingType="
                + swimmingType
                + '}';
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "speciesOfSharks" + ","
                + "speed" + ","
                + "swimmingType" + '\n';
    }

    public String toCSV() {
        return super.toCSV() + ","
                + speciesOfSharks + ","
                + speed + ","
                + swimmingType + '\n';
    }
}
