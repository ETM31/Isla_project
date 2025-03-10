package Seres.Animales;

import Seres.Animal;

public class Fabrica {

    public static Animal crearAnimal(AnimalesFabrica animlalesFabrica, int vX, int vY, int x, int y, boolean genero){
        Animal animal;
        switch (animlalesFabrica) {
            case BOA -> animal = new Boa(vX, vY, x, y, genero);
            case CABALLO -> animal = new Caballo(vX, vY, x, y, genero);
            case CIERVO -> animal = new Ciervo(vX, vY, x, y, genero);
            case CONEJO -> animal = new Conejo(vX, vY, x, y, genero);
            case LOBO -> animal = new Lobo(vX, vY, x, y, genero);
            case ORUGA -> animal = new Oruga(vX, vY, x, y, genero);
            case OSO -> animal = new Oso(vX, vY, x, y, genero);
            case PATO -> animal = new Pato(vX, vY, x, y, genero);
            case RATON -> animal = new Raton(vX, vY, x, y, genero);
            case ZORRO -> animal = new Zorro(vX, vY, x, y, genero);
            default -> throw new IllegalStateException("no te entiendo, no hay un animal: " + animlalesFabrica);
        }

        return animal;
    }


}
