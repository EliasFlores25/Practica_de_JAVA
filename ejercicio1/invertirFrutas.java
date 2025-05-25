package ejercicio1;
import java.util.Scanner;

public class invertirFrutas {
    public static void main(String[] args) {
        String[] frutas = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 10 nombres de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = entrada.nextLine();
        }

        System.out.println("
        Contenido del vector en forma inversa:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        entrada.close();
    }
}