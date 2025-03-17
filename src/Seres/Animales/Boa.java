package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Alimentacion.Probabilidades;
import Seres.Animal;

public class Boa extends Animal implements Eats {
    public Boa(int x, int y) {
        super(1, 15, 3, x, y, 30);
    }

    @Override
    public boolean isCarnivorous() {
        return true;
    }

    @Override
    public boolean isHerviborous() {
        return false;
    }

    @Override
    public String draw() {
        return "🐍";
    }
}
