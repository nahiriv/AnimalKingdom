package Zoo;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import Utils.CSVReader;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        Zoo Zoo1 = new Zoo("Botanic");

        ZooArea Area1 = new ZooArea("Carnivore Kingdom", 3);
        ZooArea Area2 = new ZooArea("Large Herbivores", 2);
        ZooArea Area3 = new ZooArea("Big Cats", 4);

        Animal Lion1 = new Lion("Simba",2018);
        Animal Lion2 = new Lion("Nala",2019);
        Animal Lion3 = new Lion("Aslan",2020);
        Animal Lion4 = new Lion("Leo",2021);
        Animal Lion5 = new Lion("Mufasa",2022);

        Animal Elephant1 = new Elephant("Dumbo",2020);
        Animal Elephant2 = new Elephant("Babar",2021);
        Animal Elephant3 = new Elephant("Tantor",2022);

        // New areas in Zoo1
        Zoo1.addArea(Area1);
        Zoo1.addArea(Area2);
        Zoo1.addArea(Area3);

        // Lions in Carnivore Kingdom
        Area1.addAnimal(Lion1);

        // Elephant in Large Herbivores
        Area2.addAnimal(Elephant1);
        Area2.addAnimal(Elephant2);
        //Area2.addAnimal(Elephant3); // Cannot add more than 2 animals (validation)

        // Lions in Big Cats
        Area3.addAnimal(Lion2);
        Area3.addAnimal(Lion3);
        Area3.addAnimal(Lion4);
        Area3.addAnimal(Lion5);

        //Stream for filters
        System.out.println(Zoo1.getZooName() + " Areas:");
        Zoo1.getAreas().forEach(zooArea -> System.out.println("-" + zooArea.getAreaName()));

        System.out.println("---------------------------");

        System.out.println("Area: " + Area1.getAreaName() + "\nMax Capacity: " + Area1.getCapacity() + "\nAnimals:");
        Area1.getAnimals().forEach(animal -> System.out.println("-" +animal.getName()));

        System.out.println("---------------------------");

        System.out.println("Area: " + Area2.getAreaName() + "\nMax Capacity: " + Area2.getCapacity() + "\nAnimals:");
        Area2.getAnimals().forEach(animal -> System.out.println("-" + animal.getName()));

        System.out.println("---------------------------");

        System.out.println("Area: " + Area3.getAreaName() + "\nMax Capacity: " + Area3.getCapacity() + "\nAnimals:");
        Area3.getAnimals().forEach(animal -> System.out.println("-" +animal.getName()));

        System.out.println("---------------------------");

        List<ZooArea> filteredAnimals = Zoo1.getAreas().stream().filter(zooArea -> zooArea.getCurrentAnimalCount() > 1).toList();
        filteredAnimals.forEach(zooArea -> zooArea.getAnimals().forEach(animal -> System.out.println("-Specie:" + animal.getSpecie() + " Name: " + animal.getName() + " Age: " + (2024 -animal.getBirthYear()))));

        // File Creation
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Files/OutputAnimals.csv"))) {
            writer.write(Lion1.getName()+","+Lion1.getSpecie()+","+Lion1.getBirthYear()+","+Area1.getAreaName()+","+Zoo1.getZooName());
            writer.newLine();
            writer.write(Lion2.getName()+","+Lion2.getSpecie()+","+Lion2.getBirthYear()+","+Area3.getAreaName()+","+Zoo1.getZooName());
            writer.newLine();
            writer.write(Lion3.getName()+","+Lion3.getSpecie()+","+Lion3.getBirthYear()+","+Area3.getAreaName()+","+Zoo1.getZooName());
            writer.newLine();
            writer.write(Lion4.getName()+","+Lion4.getSpecie()+","+Lion4.getBirthYear()+","+Area3.getAreaName()+","+Zoo1.getZooName());
        } catch (IOException e){
            System.out.println("An I/O error occurred: " + e.getMessage());
        }

        System.out.println("---------------------------");
        String animalsFilename = "src/Files/InputAnimals.csv";
        String areasFilename = "src/Files/InputAreas.csv";

        List<Animal> animals = CSVReader.readAnimalsFromCSV(animalsFilename);
        CSVReader.printAnimals(animals);
        List<ZooArea> areas = CSVReader.readAreasFromCSV(areasFilename);
        CSVReader.printAreas(areas);


    }
    }

