package Animals;
import Zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        Animal dog= new Dog("Chester","delmer", 2018);
        //dog.makeSound();

        Animal guineapig= new GuineaPig("Cuyo","Peruvian", 2023);
        //guineapig.makeSound();

        Animal dog2= new Dog("Ron","Dachshund",2020);
        //dog2.makeSound();

        Animal dog3= new Dog("Sam","German Shepherd",2021);
        //dog3.makeSound();

        System.out.println("Quantity of dogs: " + Dog.getCounter());
        System.out.println("Quantity of guinea pigs: " + GuineaPig.getCounter());

        System.out.println("Total number of animals: " + Animal.getCounter());
    }
    }
