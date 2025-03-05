package Seres.Alimentacion;

import Seres.Animal;

public class Plantas extends Animal{
    int x,y;
    static boolean alive = true;

    public Plantas(int x, int y) {
        super(x , y, 0, 1, 0);
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
