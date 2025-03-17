package Tablero;

import Seres.Animal;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

import java.util.concurrent.ThreadLocalRandom;

// Esta clase genera animales aleatoriamente y los dibuja
public class AnimalRandom implements Runnable {
    Animal dibujoAnimal;
    int animalRandom;
    int xRandom;
    int yRandom;

    public Animal getAnimalRandom() {
        animalRandom = ThreadLocalRandom.current().nextInt(AnimalesFabrica.values().length); // genero un numero random del enum
        xRandom = ThreadLocalRandom.current().nextInt(100);
        yRandom = ThreadLocalRandom.current().nextInt(20);
        return Fabrica.crearAnimal(AnimalesFabrica.values()[animalRandom], xRandom, yRandom);
        //AnimalesFabrica.values()[animalRandom] con esto busco el indice random de animalRandom en el enum y envia le animal a la funcion
    }

    @Override
    public void run() {
        while(true) {
            dibujoAnimal = getAnimalRandom();
            dibujoAnimal.draw();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException("Fallo la pausa al crear animales: " + e);
            }
        }
    }
}
