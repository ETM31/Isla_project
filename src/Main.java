import Seres.Animal;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;


public class Main {
    // Primero precizo de crear una lista de los animales con sus parámetros aleatorios
    /*static StringBuilder tablero;
    static Random ranodm = new Random();
    static int x, y, animalin;
    static AnimalesFabrica animalRandoms;
    static Map<Integer, Animal> listaAnimales = new ConcurrentHashMap<Integer, Animal>();*/

    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            animalin = ranodm.nextInt(AnimalesFabrica.values().length);
            x = ranodm.nextInt(10);
            y = ranodm.nextInt(10);
            listaAnimales.put(i, Fabrica.crearAnimal(AnimalesFabrica.values()[animalin], x, y));
        }*/
        Animal animal1 = Fabrica.crearAnimal(AnimalesFabrica.ZORRO, 3, 4);
        Animal animal2 = Fabrica.crearAnimal(AnimalesFabrica.OSO, 3, 4);
        animal1.comer(animal2);

    }
}