package Seres.Animales.Carnivorous;

import Seres.Interacciones.Eats;
import Seres.Animal;

public class Raton extends Animal implements Eats {
    public Raton(int x, int y){
        super(1, .05F, .01F, x, y, 500);
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
    public String draw() {
        return "🐭";
    }
}
