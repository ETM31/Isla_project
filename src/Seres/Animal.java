package Seres;

import Seres.Interacciones.Eats;
import Seres.Interacciones.Probabilidades;
import Seres.Animales.AnimalesFabrica;
import Seres.Animales.Fabrica;

//import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Random;

public abstract class Animal implements Eats {
    private int x, y; // para saber donde se ubicará
    private int weight;
    private int maxSpeed;
    private int needOfFood;
    private boolean living = true;
    private float weightF;
    private float needOfFoodF;
    private int limite;
    private boolean genero; //la idea es que si es "false" sea macho, y si es "true" es hembra
    Random random = new Random();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isGenero() {
        return genero;
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

    /**
     * Lo que hice es que comer() está en la clase Interacciones, esa clase se encargará de llamar los métodos según
     * como se vea que puede que actuen los Objetos
     * @param animal2
     */
    public void comer(/*Map<Integer, Animal> animales*/Animal animal2) {
        //for (Animal animal : animales.values()) {
            //Probabilidades.chequeoProbabilidad(this.getClass(), animal);
            for(Map.Entry<Class<?>, Map<Class<?>, Integer>> animal : Probabilidades.PROBABILIDADES_ALIMANTACION.entrySet()){
                System.out.println(animal.getKey().getSimpleName() + ":");
                if (animal.getKey() == this.getClass()){
                    for (Map.Entry<Class<?>, Integer> probabilidad : animal.getValue().entrySet()){
                        //System.out.println(probabilidad.getValue() + " probabilidad " + probabilidad.getKey().getSimpleName());
                        if (probabilidad.getKey() == animal2.getClass()) {
                            System.out.println(probabilidad.getValue() + " " + probabilidad.getKey().getSimpleName());
                        } else {
                            throw new RuntimeException(animal.getKey().getSimpleName() + " no come " + animal2.getClass().getSimpleName());
                        }
                    }
                    break;
                }
            }

        //}
    }

    int posinega = 0;
    public void direction(){
        posinega = random.nextInt(this.maxSpeed+1);
        this.x += random.nextInt(this.maxSpeed+1) - posinega;
        this.y += random.nextInt(this.maxSpeed+1) - posinega;
    }

    public void reproduction(/*Map<Integer, Animal> mapAnimales*/){
        Animal cria = null;
        //for (Animal animal1 : mapAnimales.values()) {
            //if (animal1.genero != this.genero && this.x == animal1.x && this.y == animal1.y && this.getClass() == animal1.getClass()) {
                AnimalesFabrica enumTipoAnimalBb = AnimalesFabrica.fromClass(this.getClass());
                cria = Fabrica.crearAnimal(enumTipoAnimalBb, this.x + 1, this.y + 1);
                //mapAnimales.put(mapAnimales.size()-1,cria);
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
            //}
        //}
    }

    public abstract String draw();
}
