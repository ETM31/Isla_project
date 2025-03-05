package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Pato extends Animal implements Eats {
    public Pato(int x, int y) {
        super(x, y, 4, 1, .15F);
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
        System.out.println("🦆");
    }
}
