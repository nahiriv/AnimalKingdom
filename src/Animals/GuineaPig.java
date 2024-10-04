package Animals;

public class GuineaPig extends Animal{
    static int counter = 0;
    public GuineaPig(String name, String breed){
        super(name, breed, "GuineaPig");
        counter++;
    }
    @Override
    public void  makeSound(){
        System.out.println(this.getName() + " the "+ this.getSpecie() + " is saying " + "Eek!!");
    }
    public static int getCounter(){
        return counter;
    }
}
