package Seres;

import Seres.Alimentacion.Probabilidades;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

//import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public abstract class Animal {
    protected int x, y, vX, vY; // para saber donde se ubicará
    protected int weight;
    protected int maxSpeed;
    protected int needOfFood;
    private boolean living = true;
    protected float weightF;
    protected float needOfFoodF;
    private int limite;
    private boolean genero; //la idea es que si es "false" sea macho, y si es "true" es hembra
    Random random = new Random();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isLiving() {
        return living;
    }

    public void kill() {
        this.living = false;
    }

    public Animal(int maxSpeed, float weight, float needOfFood, int x, int y, int limite) {
        this.x = x;
        this.y = y;
        this.maxSpeed = maxSpeed;
        this.weightF = weight;
        this.needOfFoodF = needOfFood;
        this.limite = limite;
        this.genero = random.nextBoolean();
    }

    public Animal(int maxSpeed, int weight, int needOfFood, int x, int y, int limite) {
        this.x = x;
        this.y = y;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.needOfFood = needOfFood;
        this.limite = limite;
        this.genero = random.nextBoolean();
    }

    public void comer(Animal animal) {
        Probabilidades.chequeoProbabilidad(this.getClass(), animal);
    }

    int posinega = 0;
    public void direction(Animal animal){
        posinega = random.nextInt(animal.maxSpeed+1);
        this.x += random.nextInt(animal.maxSpeed+1) - posinega;
        this.y += random.nextInt(animal.maxSpeed+1) - posinega;
    }

    public Animal reproduction(Animal animal1, Animal animal2){
        Animal cria = null;
        if(animal2.genero != animal1.genero && animal1.x == animal2.x && animal1.y == animal2.y && animal1.getClass() == animal2.getClass()){
            AnimalesFabrica enumTipoAnimalBb = AnimalesFabrica.fromClass(animal1.getClass());
            cria = Fabrica.crearAnimal(enumTipoAnimalBb, animal1.x+1, animal1.y+1);
            System.out.println("la cria nacio");
            /*
            Al final no use este porque para algo hice la clase Fabrica
            try {
                //Animal cria = animal1.getClass().getConstructor(int.class, int.class, boolean.class).newInstance(animal1.x+1, animal1.y+1, genero);
                AnimalesFabrica cria = AnimalesFabrica.fromClass(animal1.getClass());
                Fabrica.crearAnimal(cria, animal1.x+1, animal1.y+1);
                System.out.println("la cria nacio");
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                new RuntimeException("No se encontró el constructor ni el animal en referencia" + e);
            }*/
        } else {
            System.out.println("No nacio la cria");
        }
        return cria;
    }

    public abstract String draw();


    /*public void alive(Animal animal, Animal animalin){

            if (animal instanceof Eats && animalin instanceof Eats && animal != null && animalin != null) {
                if(((Eats) animal).isCarnivorous() && ((Eats) animalin).isHerviborous()){
                    living = false;
                }
            }

    }*/



}
