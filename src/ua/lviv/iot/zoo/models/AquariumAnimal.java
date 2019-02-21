package ua.lviv.iot.zoo.models;

public class AquariumAnimal {

    private String name;
    private int age;
    private int yearInZoo;
    private Sex sex;
    private int volumeOfAquarium;
    private Species speciesOfAnimal;

    public AquariumAnimal(){

    }

    public AquariumAnimal(String name, int age, int yearInZoo, Sex sex, int volumeOfAquarium, Species speciesOfAnimal) {
        this.name = name;
        this.age = age;
        this.yearInZoo = yearInZoo;
        this.sex = sex;
        this.volumeOfAquarium = volumeOfAquarium;
        this.speciesOfAnimal = speciesOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearInZoo() {
        return yearInZoo;
    }

    public void setYearInZoo(int yearInZoo) {
        this.yearInZoo = yearInZoo;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getVolumeOfAquarium() {
        return volumeOfAquarium;
    }

    public void setVolumeOfAquarium(int volumeOfAquarium) {
        this.volumeOfAquarium = volumeOfAquarium;
    }

    public Species getSpeciesOfAnimal() {
        return speciesOfAnimal;
    }

    public void setSpeciesOfAnimal(Species speciesOfAnimal) {
        this.speciesOfAnimal = speciesOfAnimal;
    }

    @Override
    public String toString() {
        return "AquariumAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearInZoo=" + yearInZoo +
                ", sex=" + sex +
                ", volumeOfAquarium=" + volumeOfAquarium +
                ", speciesOfAnimal=" + speciesOfAnimal +
                '}';
    }
}
