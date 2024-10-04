package Animals;

public abstract class Animal {
    private String name;
    private String breed;
    private String specie;
    private static int Animalcounter = 0;
    public Animal(String name, String breed, String specie) {
        this.name = name;
        this.breed = breed;
        this.specie = specie;
        Animalcounter++;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return this.breed;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public String getSpecie() {
        return this.specie;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static int getCounter(){
        return Animalcounter;
    }
    public abstract void makeSound();

}
