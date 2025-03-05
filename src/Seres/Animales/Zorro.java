package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Zorro extends Animal implements Eats {
    public Zorro(int x, int y) {
        super(x, y, 2, 8, 2);
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
        System.out.println("🦊");
    }
}
