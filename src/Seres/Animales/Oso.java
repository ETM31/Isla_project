package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Oso extends Animal implements Eats {
    public Oso(int x, int y) {
        super(x, y, 2, 500, 80);
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
        System.out.println("🐻");
    }
}
