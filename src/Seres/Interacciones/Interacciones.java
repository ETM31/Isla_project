package Seres.Interacciones;

import Seres.Animal;

import java.util.Map;

public class Interacciones {
    public static void verificarInteracciones(Map<Integer, Animal> animalesLista) {
        for (Animal animal1 : animalesLista.values()){
            for (Animal animal2 : animalesLista.values()){
                if(animal1.getY() == animal2.getY() && animal1.getX() == animal2.getX())
                    interact(animal1, animal2);

            }
        }
    }

    private static void interact(Animal animal1, Animal animal2) {
        if (animal1.getClass() == animal2.getClass() && animal1.isGenero() != animal2.isGenero())
            animal1.reproduction();

        if (animal1.getClass() != animal2.getClass())
            animal1.comer(animal2);

    }

    public static void main(String[] args) {

    }
}
