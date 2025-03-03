package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Zorro extends Animal implements Eats {
    @Override
    public boolean isCarnivorous() {
        return false;
    }

    @Override
    public boolean isHerviborous() {
        return false;
    }

    @Override
    public void comer() {

    }

    @Override
    public void reproduction() {

    }
}
