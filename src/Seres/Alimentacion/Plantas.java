package Seres.Alimentacion;

import Seres.Animal;

public class Plantas extends Animal{
    int x,y;
    static boolean alive = true;

    public Plantas(int vX, int vY, int x, int y) {
        super(vX , vY, 0, 1, 0, x, y, 200, false);
    }

    static void kill(){
        alive = false;
    }

    @Override
    public void comer() {

    }

    @Override
    public void reproduction() {

    }

    @Override
    public void draw() {
        System.out.println("🎄");
    }
}
