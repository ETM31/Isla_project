package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Oso extends Animal implements Eats {
    public Oso(int x, int y, boolean genero) {
        super(2, 500, 80, x, y, 5, genero);
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
    public void draw() {
        System.out.println("🐻");
    }
}
