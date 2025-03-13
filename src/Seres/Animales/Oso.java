package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Oso extends Animal implements Eats {
    public Oso(int x, int y) {
        super(2, 500, 80, x, y, 5);
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
    public void comer() {

    }

    @Override
    public String draw() {
        System.out.println("🐻");
        return null;
    }
}
