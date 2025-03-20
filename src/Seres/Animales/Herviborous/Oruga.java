package Seres.Animales.Herviborous;

import Seres.Interacciones.Eats;
import Seres.Animal;

public class Oruga extends Animal implements Eats {
    public Oruga(int x, int y) {
        super(0, .01F, 0, x, y, 1000);
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
    public String draw() {
        return "🐛";
    }
}
