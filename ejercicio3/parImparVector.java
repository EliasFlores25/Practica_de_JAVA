package ejercicio3;
import java.util.Scanner;

public class parImparVector {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner entrada = new Scanner(System.in);
        int cantidadPares = 0;
        int cantidadImpares = 0;

        System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0) { 
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

        entrada.close();
    }
}