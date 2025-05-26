package ejercicio7;
import java.util.Scanner;

public class puntoDeSilla {
    public static void main(String[] args) {
       
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 12 valores numéricos para la matriz " + filas + "x" + columnas + ":");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        boolean encontradoPuntoSilla = false;

        for (int i = 0; i < filas; i++) {
            int minFila = matriz[i][0];
            int indiceColumnaMinFila = 0;
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    indiceColumnaMinFila = j;
                }
            }

            boolean esMaxColumna = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][indiceColumnaMinFila] > minFila) {
                    esMaxColumna = false;
                    break;
                }
            }

            if (esMaxColumna) {
                System.out.println("Punto de Silla encontrado");
                System.out.println("El valor es: " + minFila + " en la posición [" + i + "][" + indiceColumnaMinFila + "]");
                encontradoPuntoSilla = true;
                break;
            }
        }

        if (!encontradoPuntoSilla) {
            System.out.println("No se encontró ningún punto de silla en la matriz.");
        }

        entrada.close();
    }
}
