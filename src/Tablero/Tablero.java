package Tablero;

public class Tablero {
    static int[][] coordenadas = new int[100][20];
    public static void draw(){
        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < 19; j++) {
                coordenadas[i][j] = 0;
                System.out.print(coordenadas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
