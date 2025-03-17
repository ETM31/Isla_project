package Tablero;

import Seres.Animal;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

import java.util.concurrent.ThreadLocalRandom;

public class Tablero implements Runnable{
    static StringBuilder tablero = new StringBuilder();
    static int animalRandom;
    static int xRandom;
    static int yRandom;
    //static AnimalRandom animalRandom = new AnimalRandom();
    //static Thread animalRand = new Thread(animalRandom);

    //Creamos una clase para generar los animales, este codigo esta ahi
    /*public static Animal getAnimalRandom() {
        int animalRandom = ThreadLocalRandom.current().nextInt(AnimalesFabrica.values().length); // genero un numero random del enum
        int xRandom = ThreadLocalRandom.current().nextInt(200);
        int yRandom = ThreadLocalRandom.current().nextInt(20);
        return Fabrica.crearAnimal(AnimalesFabrica.values()[animalRandom], xRandom, yRandom);
        //AnimalesFabrica.values()[animalRandom] con esto busco el indice random de animalRandom en el enum y envia le animal a la funcion
    }*/

    public static Animal getAnimalRandom() {
        animalRandom = ThreadLocalRandom.current().nextInt(AnimalesFabrica.values().length); // genero un numero random del enum
        xRandom = ThreadLocalRandom.current().nextInt(100-1);
        yRandom = ThreadLocalRandom.current().nextInt(20-1);
        return Fabrica.crearAnimal(AnimalesFabrica.values()[animalRandom], xRandom, yRandom);
        //AnimalesFabrica.values()[animalRandom] con esto busco el indice random de animalRandom en el enum y envia le animal a la funcion
    }

    public static void draw(){
        for (int i = 0; i < 50; i++) {
            Animal animalon = getAnimalRandom();
            for (int j = 0; j < 10; j++) {


                if (j == animalon.getY() && i == animalon.getX()) {
                    tablero.append(animalon.draw());
                }else {
                    if (i == 0 || i == 49) {
                        tablero.append("-");
                    } else {
                        tablero.append(" 0 ");
                    }
                }
            }
            tablero.append("\n");
        }
        System.out.println(tablero);
    }


    @Override
    public void run() {
        {
            while(true) {
                draw();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("fallo" + e);
                }
            }
        }
    }
}
