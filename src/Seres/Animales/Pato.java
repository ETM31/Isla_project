package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Pato extends Animal implements Eats {
    public Pato(int vX, int vY, int x, int y, boolean genero) {
        super(vX, vY, 4, 1, .15F, x, y, 200, genero);
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
