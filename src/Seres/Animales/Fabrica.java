package Seres.Animales;

import Seres.Animal;


public class Fabrica {

    public static Animal crearAnimal(AnimalesFabrica animalesFabrica, int x, int y){
        Animal animal;
        switch (animalesFabrica) {
            case BOA -> animal = new Boa(x, y);
            case CABALLO -> animal = new Caballo(x, y);
            case CIERVO -> animal = new Ciervo(x, y);
            case CONEJO -> animal = new Conejo(x, y);
            case LOBO -> animal = new Lobo(x, y);
            case ORUGA -> animal = new Oruga(x, y);
            case OSO -> animal = new Oso(x, y);
            case PATO -> animal = new Pato(x, y);
            case RATON -> animal = new Raton(x, y);
            case ZORRO -> animal = new Zorro(x, y);
            default -> throw new IllegalStateException("no te entiendo, no hay un animal: " + animalesFabrica);
        }

        return animal;
    }




}
