package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Conejo extends Animal implements Eats {
    public Conejo(int x, int y) {
        super(x, y, 2, 2, .45F);
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
    public void reproduction() {

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC07");
    }
}
