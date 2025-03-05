package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Boa extends Animal implements Eats {
    public Boa(int x, int y) {
        super(x, y, 1, 15, 3);
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
    public void reproduction() {

    }

    @Override
    public void draw() {
        System.out.println("🐍");
    }
}
