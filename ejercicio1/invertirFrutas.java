package ejercicio1;
import java.util.Scanner;

public class invertirFrutas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] frutas = new String[10];

        System.out.println("Por favor ingrese 10 nombres de frutas:");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Ingrese el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = entrada.nextLine();
        }

        System.out.println("Se muestra el contenido del vector 'FRUTAS' en orden inverso:");

        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
        }

        entrada.close();
    }
}