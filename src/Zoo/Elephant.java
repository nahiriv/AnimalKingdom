package Zoo;

public class Elephant implements Animal {
    private String name;
    private String specie;
    private int birthYear;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSpecie() {
        return specie;
    }
    @Override
    public int getBirthYear() {
        return birthYear;
    }
}
