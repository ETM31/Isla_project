package Seres.Animales.Carnivorous;

import Seres.Interacciones.Eats;
import Seres.Animal;

public class Lobo extends Animal implements Eats {
    public Lobo(int x, int y){
        //trata de hacer uqe la velocidad pueda variar de 0 a 3
        super(3, 50, 8, x, y, 30);
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
    public String draw() {
        return "🐺";
    }
}
