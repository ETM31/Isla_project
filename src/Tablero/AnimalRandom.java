package Tablero;

import Seres.Animal;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

import java.util.concurrent.ThreadLocalRandom;

// Esta clase genera animales aleatoriamente y los dibuja
public class AnimalRandom implements Runnable {

    public Animal getAnimalRandom() {
        int animalRandom = ThreadLocalRandom.current().nextInt(AnimalesFabrica.values().length); // genero un numero random del enum
        int xRandom = ThreadLocalRandom.current().nextInt(100);
        int yRandom = ThreadLocalRandom.current().nextInt(20);
        return Fabrica.crearAnimal(AnimalesFabrica.values()[animalRandom], xRandom, yRandom);
        //AnimalesFabrica.values()[animalRandom] con esto busco el indice random de animalRandom en el enum y envia le animal a la funcion
    }

    @Override
    public void run() {
        Animal dibujoAnimal;
        for (int i = 0; i < 10 - 1; i++) {
            dibujoAnimal = getAnimalRandom();
            dibujoAnimal.draw();
        }
    }
}
