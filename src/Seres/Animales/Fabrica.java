package Seres.Animales;

import Seres.Animal;

public class Fabrica {

    public static Animal crearAnimal(AnimalesFabrica animlalesFabrica, int x, int y, boolean genero){
        Animal animal;
        switch (animlalesFabrica) {
            case BOA -> animal = new Boa(x, y, genero);
            case CABALLO -> animal = new Caballo(x, y, genero);
            case CIERVO -> animal = new Ciervo(x, y, genero);
            case CONEJO -> animal = new Conejo(x, y, genero);
            case LOBO -> animal = new Lobo(x, y, genero);
            case ORUGA -> animal = new Oruga(x, y, genero);
            case OSO -> animal = new Oso(x, y, genero);
            case PATO -> animal = new Pato(x, y, genero);
            case RATON -> animal = new Raton(x, y, genero);
            case ZORRO -> animal = new Zorro(x, y, genero);
            default -> throw new IllegalStateException("no te entiendo, no hay un animal: " + animlalesFabrica);
        }

        return animal;
    }




}
