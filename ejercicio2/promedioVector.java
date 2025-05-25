import java.util.Scanner;

public class promedioVector {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner entrada = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los números ingresados es: " + promedio);

        entrada.close();
    }
}