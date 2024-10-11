package Zoo;

public class Elephant implements Animal {
    private String name;
    private String specie;
    private int birthYear;


    public Elephant(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.specie = "Elephant";
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSpecie() {return specie;}
    @Override
    public int getBirthYear() {
        return birthYear;
    }
}
