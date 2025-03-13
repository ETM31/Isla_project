import Seres.Animal;
import Seres.Animales.*;
import Tablero.AnimalRandom;
import Tablero.Tablero;

import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*AnimalRandom animalRandom = new AnimalRandom();
        Thread threadAnimales = new Thread(animalRandom);
        threadAnimales.start();*/

        Tablero tablero = new Tablero();
        Tablero.draw();
    }
}