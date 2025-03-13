package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Conejo extends Animal implements Eats {
    public Conejo(int x, int y) {
        super(2, 2, .45F, x, y, 150);
    }

    @Override
    public boolean isCarnivorous() {
        return false;
    }

    @Override
    public boolean isHerviborous() {
        return true;
    }

    @Override
    public void comer() {

    }

    @Override
    public String draw() {
        System.out.println("\uD83D\uDC07");
        return null;
    }
}
