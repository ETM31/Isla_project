package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Lobo extends Animal implements Eats {
    public Lobo(int x, int y){
        //trata de hacer uqe la velocidad pueda variar de 0 a 3
        super(x, y, 3, 50, 8);
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
}
