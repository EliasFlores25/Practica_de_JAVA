import java.util.Scanner;

public class mayorMenorVector {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner entrada = new Scanner(System.in);
        double mayor;
        double menor;

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El mayor número ingresado es: " + mayor);
        System.out.println("El menor número ingresado es: " + menor);

        entrada.close();
    }
}