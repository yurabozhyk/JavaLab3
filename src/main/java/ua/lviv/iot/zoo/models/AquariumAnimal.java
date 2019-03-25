package ua.lviv.iot.zoo.models;

public class AquariumAnimal {

    private String name;
    private int age;
    private int yearInZoo;
    private Sex sex;
    private int volumeOfAquarium;
    private Species speciesOfAnimal;

    public AquariumAnimal() {

    }

    public AquariumAnimal(final String nameObj, final int ageObj,
                          final int yearInZooObj,
                          final Sex sexObj, final int volumeOfAquariumObj,
                          final Species speciesOfAnimalObj) {
        this.name = nameObj;
        this.age = ageObj;
        this.yearInZoo = yearInZooObj;
        this.sex = sexObj;
        this.volumeOfAquarium = volumeOfAquariumObj;
        this.speciesOfAnimal = speciesOfAnimalObj;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameObj) {
        this.name = nameObj;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(final int ageObj) {
        this.age = ageObj;
    }

    public final int getYearInZoo() {
        return yearInZoo;
    }

    public final void setYearInZoo(final int yearInZooObj) {
        this.yearInZoo = yearInZooObj;
    }

    public final Sex getSex() {
        return sex;
    }

    public final void setSex(final Sex sexObj) {
        this.sex = sexObj;
    }

    public final int getVolumeOfAquarium() {
        return volumeOfAquarium;
    }

    public final void setVolumeOfAquarium(final int volumeOfAquariumObj) {
        this.volumeOfAquarium = volumeOfAquariumObj;
    }

    public final Species getSpeciesOfAnimal() {
        return speciesOfAnimal;
    }

    public final void setSpeciesOfAnimal(final Species speciesOfAnimalObj) {
        this.speciesOfAnimal = speciesOfAnimalObj;
    }

    @Override
    public String toString() {
        return "AquariumAnimal{"
                + "name='"
                + name
                + '\''
                + ", age="
                + age
                + ", yearInZoo="
                + yearInZoo
                + ", sex="
                + sex
                + ", volumeOfAquarium="
                + volumeOfAquarium
                + ", speciesOfAnimal="
                + speciesOfAnimal
                + '}';
    }

    public String getHeaders() {
        return "name" + ","
                + "age" + ","
                + "yearInZoo" + ","
                + "sex" + ","
                + "volumeOfAquarium" + ","
                + "speciesOfAnimal";
    }

    public String toCSV() {
        return name + ","
                + age + ","
                + yearInZoo + ","
                + sex + ","
                + volumeOfAquarium + ","
                + speciesOfAnimal;
    }
}
