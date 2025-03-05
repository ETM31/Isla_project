package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Caballo extends Animal implements Eats {
    public Caballo(int x, int y) {
        super(x, y, 4, 400, 60);
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
        System.out.println("🐎");
    }
}
