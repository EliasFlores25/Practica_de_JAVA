import java.util.Scanner;

public class promedioVector {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];
        int suma = 0;

        System.out.println("Por favor, ingrese 12 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        
        double promedio = (double) suma / numeros.length;

        System.out.println("Números ingresados:");
       
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println();

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números ingresados es: " + String.format("%.2f", promedio));

        entrada.close();
    }
}