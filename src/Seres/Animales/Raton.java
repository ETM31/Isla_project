package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Raton extends Animal implements Eats {
    public Raton(int x, int y, boolean genero){
        super(1, .05F, .01F, x, y, 500, genero);
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
        System.out.println("🐭");
    }
}
