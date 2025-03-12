package Seres.Animales;

import Seres.Alimentacion.Eats;
import Seres.Animal;

public class Zorro extends Animal implements Eats {
    public Zorro(int x, int y, boolean genero) {
        super(2, 8, 2, x, y, 30, genero); // Le puse 3 porque no se por que no me da el 2
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
        System.out.println("🦊");
    }
}
