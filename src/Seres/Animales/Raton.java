package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Raton extends Animal implements Eats {
    public Raton(int x, int y) {
        super(x, y, 1, .05F, .01F);
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
        System.out.println("🐭");
    }
}
