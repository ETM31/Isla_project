package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Ciervo extends Animal implements Eats {
    public Ciervo(int x, int y) {
        super(4, 300, 50, x, y, 20);
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
        System.out.println("🦌");
        return null;
    }
}
