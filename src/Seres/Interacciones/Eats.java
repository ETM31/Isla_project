package Seres.Interacciones;

public interface Eats {
    boolean isCarnivorous(); // Los carn[ivoros necesitan su propio porcentaje para ver si se comen o no a los otros animales
    boolean isHerviborous();
        // acá pondré como default que los hervívoros sólo coman plantas y que será seguro que lo harán

}
