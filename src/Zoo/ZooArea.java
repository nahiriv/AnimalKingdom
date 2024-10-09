package Zoo;
import java.util.ArrayList;

//Clase que representa un área dentro de un zoológico.
//Cada área tiene un nombre, una capacidad máxima y puede albergar animales.

public class ZooArea {
    private String name; // Nombre del área
    private int capacity; // Capacidad máxima de animales
    private ArrayList<Animal> animals; // Lista de animales en el área

    //constructor
    public ZooArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    //metodo para agregar un animal al área
    public boolean addAnimal(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal); // Agrega el animal a la lista
            return true; // Indica que se agregó correctamente
        } else {
            System.out.println("No se puede agregar " + animal.getName() + " al área " + name +
                    ". Capacidad máxima alcanzada.");
            return false; // Indica que no se pudo agregar
        }
    }

    //metodo para obtener el nombre del área.
    public String getAreaName() {
        return name;
    }

    //metodo para obtener la lista de animales en el área.
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    //metodo para obtener la capacidad máxima del área.
    public int getCapacity() {
        return capacity;
    }

    //metodo para obtener total de animales en el area
    public int getCurrentAnimalCount() {
        return animals.size();
    }

}
