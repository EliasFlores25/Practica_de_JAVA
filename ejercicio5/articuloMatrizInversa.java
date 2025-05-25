package ejercicio5;
import java.util.Scanner;

public class articuloMatrizInversa {
    public static void main(String[] args) {
        String[][] articulos = new String[3][3];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 9 nombres de artículos (3 por fila):");
        for (int i = 0; i < articulos.length; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print("Artículo [" + i + "][" + j + "]: ");
                articulos[i][j] = entrada.nextLine();
            }
        }

        System.out.println("\nContenido de la matriz con filas invertidas:");
        for (int i = articulos.length - 1; i >= 0; i--) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print(articulos[i][j] + "\t");
            }
            System.out.println();
        }

        entrada.close();
    }
}