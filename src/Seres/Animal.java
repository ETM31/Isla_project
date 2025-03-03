package Seres;

import Seres.Alimentacion.Eats;

public abstract class Animal {
    protected int x, y; // para saber donde se ubicará
    protected int weight;
    protected int maxSpeed;
    protected int needOfFood;
    private boolean living = true;

    public Animal() {}

    public Animal(int x, int y, int maxSpeed, int weight, int needOfFood) {
        this.x = x;
        this.y = y;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.needOfFood = needOfFood;
    }

    public abstract void comer();

    public void direction(int velocidadX, int velocidadY){
        this.x += velocidadX;
        this.y += velocidadY;
    }

    public abstract void reproduction();

    /*public void alive(Animal animal, Animal animalin){

            if (animal instanceof Eats && animalin instanceof Eats && animal != null && animalin != null) {
                if(((Eats) animal).isCarnivorous() && ((Eats) animalin).isHerviborous()){
                    living = false;
                }
            }

    }*/

}
