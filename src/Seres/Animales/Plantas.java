package Seres.Animales;

import Seres.Animal;

public class Plantas extends Animal{

    public Plantas(int x, int y) {
        super(0, 1, 0, x, y, 200);
    }

    @Override
    public String draw() {
        return "🎄";
    }
}
