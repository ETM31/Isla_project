package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Ciervo extends Animal implements Eats {
    public Ciervo(int vX, int vY, int x, int y, boolean genero) {
        super(vX, vY, 4, 300, 50, x, y, 20, genero);
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
        System.out.println("🦌");
    }
}
