package Animals;

public class Main {

    public static void main(String[] args) {
        Animal dog= new Dog("Chester","delmer");
        dog.makeSound();

        Animal guineapig= new GuineaPig("Cuyo","Peruvian");
        guineapig.makeSound();

        Animal dog2= new Dog("Ron","Dachshund");
        dog2.makeSound();

        Animal dog3= new Dog("Sam","German Shepherd");
        dog3.makeSound();

        System.out.println("Quantity of dogs: " + Dog.getCounter());
        System.out.println("Quantity of guinea pigs: " + GuineaPig.getCounter());

        System.out.println("Total number of animals: " + Animal.getCounter());
    }
}