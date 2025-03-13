package Tablero;

import Seres.Animal;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

import java.util.concurrent.ThreadLocalRandom;

public class Tablero {
    static StringBuilder tablero = new StringBuilder();
    //Creamos una clase para generar los animales, este codigo esta ahi
    /*public static Animal getAnimalRandom() {
        int animalRandom = ThreadLocalRandom.current().nextInt(AnimalesFabrica.values().length); // genero un numero random del enum
        int xRandom = ThreadLocalRandom.current().nextInt(200);
        int yRandom = ThreadLocalRandom.current().nextInt(20);
        return Fabrica.crearAnimal(AnimalesFabrica.values()[animalRandom], xRandom, yRandom);
        //AnimalesFabrica.values()[animalRandom] con esto busco el indice random de animalRandom en el enum y envia le animal a la funcion
    }*/

    static Animal boa = Fabrica.crearAnimal(AnimalesFabrica.BOA, 2, 4);
    public static void draw(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == boa.getY() && i == boa.getX()) {
                    tablero.append(boa.draw());
                }else {
                    tablero.append(" ");
                }
            }
            tablero.append("\n");
        }
        System.out.println(tablero);
    }




}
