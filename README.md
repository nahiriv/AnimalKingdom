# Animal Kingdom 🦁

## Description
**Animal Kingdom** is a Java program that simulates different animals and their behaviors using object-oriented programming concepts like abstract classes, interfaces, and inheritance. The goal is to model animals, allow them to perform actions like making sounds, and keep track of how many animals of each type are created. In this version, we introduce a `Zoo` system that organizes animals into areas, enforcing capacity limits and enabling easy management of animal species.

## Features
- An abstract class `Animal` with attributes `name` and `breed`, and an abstract method `makeSound()`.
- An interface `Animal` that defines methods like `getSpecie()`, `getBreed()`, `getName()`, and `getBirthYear()`.
- Derived classes like `Dog`, `GuineaPig`, `Lion`, and `Elephant`, which implement the `makeSound()` method and the `Animal` interface with specific behavior for each animal.
- A `Zoo` class that contains multiple `ZooArea` objects and manages them.
- A `ZooArea` class with a capacity attribute, indicating the maximum number of animals it can contain, and methods to manage animal addition.
- Static attributes in the `Animal` class that count the total number of animals created, as well as static attributes in each derived class that count how many animals of that species have been created.
- A main method in each package to test the creation of the zoo, areas, and animals, ensuring that an area does not exceed its capacity. It also uses a Stream to filter areas with more than a specified number of animals and prints their names, species, breeds, and ages.
- File I/O: Animal and area data are loaded from CSV files using the CSVReaderWriter utility class.
- Error Handling: Proper exception handling is in place for file reading, such as dealing with missing files,etc

## Project Structure
```bash
Animal-Kingdom/
├── src/
│   ├── Animals/
│   │   ├── Animal.java
│   │   ├── Dog.java
│   │   ├── GuineaPig.java
│   │   └── Main.java
│   ├── Zoo/
│   │   ├── Zoo.java
│   │   ├── ZooArea.java
│   │   ├── Lion.java
│   │   ├── Elephant.java
│   │   └── Main.java
│   ├── Utils/
│   │   └── CSVReaderWriter.java
│   ├── files/
│   │   ├── InputAnimals.csv
│   │   └── InputAreas.csv
│   │   └── OutputAnimals.csv  
├── README.md
└── .gitignore



