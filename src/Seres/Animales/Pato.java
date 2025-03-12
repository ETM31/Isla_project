package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Pato extends Animal implements Eats {
    public Pato(int x, int y, boolean genero) {
        super(4, 1, .15F, x, y, 200, genero);
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
        System.out.println("🦆");
    }
}
