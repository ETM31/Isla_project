package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Oruga extends Animal implements Eats {
    public Oruga(int x, int y) {
        super(x, y, 0, .01F, 0);
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
        System.out.println("🐛");
    }
}
