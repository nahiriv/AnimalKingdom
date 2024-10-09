package Animals;
import java.util.List;
import java.util.stream.Collectors;

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


        Zoo myZoo = new Zoo("Jardin Botanico");


        ZooArea exoticAnimals = new ZooArea("Animales Exóticos", 5);
        ZooArea inExtinction = new ZooArea("Animales en Peligro de Extinción", 3);
        ZooArea inAdoption = new ZooArea("En Adopción", 5);
        myZoo.addArea(exoticAnimals);
        myZoo.addArea(inExtinction);
        myZoo.addArea(inAdoption);

        Animal dog4 = new Dog("Buddy", "Golden Retriever", 2020);
        inAdoption.addAnimal(dog4);
        System.out.println("Cantidad de animales en " + inAdoption.getAreaName() + ": " + inAdoption.getCurrentAnimalCount());
        //todo:Implementar lógica para manejar la capacidad de los animales en las áreas
        //todo:Usar Streams para filtrar y mostrar detalles de los animales

    }
    }
