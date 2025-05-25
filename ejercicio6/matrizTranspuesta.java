package ejercicio6;
import java.util.Scanner;

public class matrizTranspuesta {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[3][3];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 9 valores numéricos para la matriz 3x3:");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] matrizTranspuesta = new int[matrizOriginal[0].length][matrizOriginal.length];

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " \t");
            }
            System.out.println();
        }

        entrada.close();
    }
}
