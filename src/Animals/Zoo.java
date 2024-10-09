package Animals;

import java.util.ArrayList;

//Clase que representa un zoo
//Un zoológico tiene un nombre y varias áreas donde se pueden albergar animales
public class Zoo {
    private String name; // Nombre del zoológico
    private ArrayList<ZooArea> areas; // Lista de áreas del zoológico

    //constructor
    public Zoo(String name) {
        this.name = name;
        this.areas = new ArrayList<>(); // Inicializa la lista de áreas
    }

    //metodo para agregar un área al zoo
    public void addArea(ZooArea area) {
        areas.add(area); // Agrega el área a la lista
    }

    //metodo para obtener el nombre del zoo
    public String getZooName() {
        return name;
    }

    //metodo para obtener la lista de áreas del zoológico.
    public ArrayList<ZooArea> getAreas() {
        return areas;
    }
}
