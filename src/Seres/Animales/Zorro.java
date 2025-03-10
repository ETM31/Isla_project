package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Zorro extends Animal implements Eats {
    public Zorro(int vX, int vY, int x, int y, boolean genero) {
        super(vX, vY, 2, 8, 2, x, y, 30, genero);
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
