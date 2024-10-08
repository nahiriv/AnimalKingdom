# Animal Kingdom 🦁

## Description
**Animal Kingdom** is a Java program that simulates different animals and their behaviors using object-oriented programming concepts like abstract classes and inheritance. The goal is to model animals, allow them to perform actions like making sounds, and keep track of how many animals of each type are created.

## Features
- An abstract class `Animal` with attributes `name` and `breed`, and an abstract method `makeSound()`.
- Derived classes like `Dog` and `GuineaPig`, which implement the `makeSound()` method with specific behavior for each animal.
- A static attribute in the `Animal` class that counts the total number of animals created.
- Static attributes in each derived class that count how many animals of that species have been created.

## Project Structure

```bash
Animal-Kingdom/
├── src/
│   └── Animals/
│       ├── Animal.java
│       ├── Dog.java
│       ├── GuineaPig.java
│       └── Main.java
├── README.md
└── .gitignore

