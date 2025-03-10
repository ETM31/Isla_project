package Seres;

import Seres.Alimentacion.Eats;

public abstract class Animal {
    protected int x, y, vX, vY; // para saber donde se ubicará
    protected int weight;
    protected int maxSpeed;
    protected int needOfFood;
    private boolean living = true;
    protected float weightF;
    protected float needOfFoodF;
    public int limite;
    public boolean genero; //la idea es que si es "false" sea macho, y si es "true" es hembra

    public Animal(int vX, int vY, int maxSpeed, int weight, int needOfFood, int x, int y, int limite, boolean genero) {
        this.vX = vX;
        this.vY = vY;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.needOfFood = needOfFood;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.genero = genero;
    }

    public Animal(int vX, int vY, int maxSpeed, float weight, float needOfFood, int x, int y, int limite, boolean genero) {
        this.vX = vX;
        this.vY = vY;
        this.maxSpeed = maxSpeed;
        this.weightF = weight;
        this.needOfFoodF = needOfFood;
        this.limite = limite;
        this.genero = genero;
    }

    public abstract void comer();

    public void direction(int velocidadX, int velocidadY){
        this.vX += velocidadX;
        this.vY += velocidadY;
    }

    public abstract void reproduction();

    public abstract void draw();

    /*public void alive(Animal animal, Animal animalin){

            if (animal instanceof Eats && animalin instanceof Eats && animal != null && animalin != null) {
                if(((Eats) animal).isCarnivorous() && ((Eats) animalin).isHerviborous()){
                    living = false;
                }
            }

    }*/

}
