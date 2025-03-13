package Seres.Alimentacion;

import Seres.Animal;

public class Plantas extends Animal{
    int x,y;
    static boolean alive = true;

    public Plantas(int x, int y) {
        super(0, 1, 0, x, y, 200);
    }

    static void kill(){
        alive = false;
    }

    @Override
    public void comer() {

    }

    @Override
    public String draw() {
        System.out.println("🎄");
        return null;
    }
}
