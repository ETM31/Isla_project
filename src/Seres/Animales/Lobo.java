package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Lobo extends Animal implements Eats {
    public Lobo(int x, int y, boolean genero){
        //trata de hacer uqe la velocidad pueda variar de 0 a 3
        super(3, 50, 8, x, y, 30, genero);
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
        System.out.println("🐺");
    }
}
