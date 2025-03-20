package Seres.Animales.Herviborous;

import Seres.Animal;

public class Plantas extends Animal{

    public Plantas(int x, int y) {
        super(0, 1, 0, x, y, 200);
    }

    @Override
    public String draw() {
        return "🎄";
    }

    @Override
    public boolean isCarnivorous() {
        return false;
    }

    @Override
    public boolean isHerviborous() {
        return false;
    }
}
