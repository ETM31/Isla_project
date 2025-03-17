package Seres.Alimentacion;

import Seres.Animal;
import Seres.Animales.*;

import java.util.concurrent.ThreadLocalRandom;

// Esta clase lo que hace es que da la probabilidad en la que un Animal puede ser comido, y de una vez la calcula,
// comiendose al animal o no.
public class Probabilidades {
    static int probabilidad;

    public static void chequeoProbabilidad(Class<?> clase, Animal animal) {
        AnimalesFabrica claseAnimal = AnimalesFabrica.fromClass(clase);

        switch (claseAnimal) {
            case BOA -> {
                checadorInstancias(animal, Zorro.class,15);
                checadorInstancias(animal, Conejo.class,20);
                checadorInstancias(animal, Raton.class,40);
                checadorInstancias(animal, Pato.class,10);
            }
            case OSO -> {
                if (animal instanceof Ciervo || animal instanceof Conejo || animal instanceof Boa) {
                    checadorInstancias(animal, 80);
                }
                checadorInstancias(animal, Caballo.class, 40);
                checadorInstancias(animal, Raton.class, 90);
                checadorInstancias(animal, Pato.class, 10);
            }
            case LOBO -> {
                checadorInstancias(animal, Caballo.class, 10);
                checadorInstancias(animal, Ciervo.class, 15);
                checadorInstancias(animal, Conejo.class, 60);
                checadorInstancias(animal, Raton.class, 80);
                checadorInstancias(animal, Pato.class, 40);
            }
            case ORUGA, CIERVO, CONEJO, CABALLO -> checadorInstancias(animal, Plantas.class, 100);
            case RATON, PATO -> {
                checadorInstancias(animal, Oruga.class, 90);
                checadorInstancias(animal, Plantas.class, 100);
            }
            case ZORRO -> {
                checadorInstancias(animal, Conejo.class, 70);
                checadorInstancias(animal, Raton.class, 90);
                checadorInstancias(animal, Pato.class, 60);
                checadorInstancias(animal, Oruga.class, 40);
            }
            case UNKNOWN -> throw new RuntimeException("Nos papeo el sistema, el switch no reconocio el enum del animal o no existe");

            case null, default -> System.out.println("error al obtener la probabilidad, lo que se envio no coinside con las opciones");

        }
    }

    public static void checadorProba(int probability, Animal animal) {
        probabilidad = ThreadLocalRandom.current().nextInt(100+1);
        if (probabilidad <= probability) {
            animal.kill();
        }
    }

    public static void checadorInstancias (Animal animal, Class<?> classes, int probability) {
        if(classes.isInstance(animal)) {
            probabilidad = ThreadLocalRandom.current().nextInt(100+1);
            checadorProba(probability, animal);
        }

    }

    public static void checadorInstancias (Animal animal, int probability) {
        probabilidad = ThreadLocalRandom.current().nextInt(100+1);
        checadorProba(probability, animal);
    }
}
