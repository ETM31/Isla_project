package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Caballo extends Animal implements Eats {
    /*public Caballo(int vX, int vY, int x, int y, boolean genero) {
        super(vX, vY, 4, 400, 60, x, y, 20, genero);
    }*/

    public Caballo(int x, int y, boolean genero) {
        super(4, 400, 60, x, y, 20, genero);
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
    public void draw() {
        System.out.println("🐎");
    }
}
