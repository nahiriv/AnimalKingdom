package Utils;
import Zoo.Animal;
import Zoo.Elephant;
import Zoo.Lion;
import Zoo.ZooArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Animal> readAnimalsFromCSV(String filename) {
        List<Animal> animals = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Saltar la línea de encabezado
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String name = data[0].trim();
                    String species = data[1].trim();
                    int birthYear = Integer.parseInt(data[2].trim());

                    // Crear un objeto Animal según la especie
                    Animal animal;
                    switch (species.toLowerCase()) {
                        case "lion":
                            animal = new Lion(name, birthYear);
                            break;
                        case "elephant":
                            animal = new Elephant(name, birthYear);
                            break;
                        default:
                            System.out.println("Invalid species: " + species + ". Line skipped.");
                            continue;
                    }

                    animals.add(animal);
                }
            }
            System.out.println("Animals read from CSV successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading animals: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number in animals data: " + e.getMessage());
        }

        return animals;
    }

    public static List<ZooArea> readAreasFromCSV(String filename) {
        List<ZooArea> areas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Saltar la línea de encabezado
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String areaName = data[0].trim();
                    int capacity = Integer.parseInt(data[1].trim());

                    // Crear un objeto ZooArea
                    ZooArea area = new ZooArea(areaName, capacity);
                    areas.add(area);

                }
            }
            System.out.println("Areas read from CSV successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading areas: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number in areas data: " + e.getMessage());
        }

        return areas;
    }

    // Método para imprimir los animales
    public static void printAnimals(List<Animal> animals) {
        System.out.println("List of Animals from CSV file:");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() + ", Specie: " + animal.getSpecie() + ", Year of Birth: " + animal.getBirthYear());
        }
    }

    // Método para imprimir las áreas
    public static void printAreas(List<ZooArea> areas) {
        System.out.println("List of Areas from CSV file:");
        for (ZooArea area : areas) {
            System.out.println("Name: " + area.getAreaName() + ", Capacity: " + area.getCapacity());
        }
    }
}