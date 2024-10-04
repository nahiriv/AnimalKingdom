package Animals;

public class Dog extends Animal{
    private static int counter = 0;
    public Dog(String name, String breed){
        super(name, breed, "Dog");
        counter++;
    }
    @Override
    public void  makeSound(){
        System.out.println(this.getName() + " the "+ this.getSpecie() + " is saying " + "Guau Guau !!");
    }
    public static int getCounter(){
        return counter;
    }
}