package Seres;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

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
    Random random = new Random();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Animal(int maxSpeed, float weight, float needOfFood, int x, int y, int limite, boolean genero) {
        this.x = x;
        this.y = y;
        this.maxSpeed = maxSpeed;
        this.weightF = weight;
        this.needOfFoodF = needOfFood;
        this.limite = limite;
        this.genero = genero;
    }

    public Animal(int maxSpeed, int weight, int needOfFood, int x, int y, int limite, boolean genero) {
        this.x = x;
        this.y = y;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.needOfFood = needOfFood;
        this.limite = limite;
        this.genero = genero;
    }

    public abstract void comer();

    int posinega = 0;
    public void direction(Animal animal){
        posinega = random.nextInt(animal.maxSpeed+1);
        this.x += random.nextInt(animal.maxSpeed+1) - posinega;
        this.y += random.nextInt(animal.maxSpeed+1) - posinega;
    }

    public void reproduction(Animal animal1, Animal animal2){
        if(animal2.genero != animal1.genero && animal1.x == animal2.x && animal1.y == animal2.y && animal1.getClass() == animal2.getClass()){
            try {
                Animal cria = animal1.getClass().getConstructor(int.class, int.class, boolean.class).newInstance(animal1.x+1, animal1.y+1, genero());
                System.out.println("la cria nacio");
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                new RuntimeException("No se encontró el constructor ni el animal en referencia" + e);
            }
        } else {
            System.out.println("No nacio la cria");
        }
    }

    public abstract void draw();

    public boolean genero(){
        return random.nextBoolean();
    }

    /*public void alive(Animal animal, Animal animalin){

            if (animal instanceof Eats && animalin instanceof Eats && animal != null && animalin != null) {
                if(((Eats) animal).isCarnivorous() && ((Eats) animalin).isHerviborous()){
                    living = false;
                }
            }

    }*/



}
