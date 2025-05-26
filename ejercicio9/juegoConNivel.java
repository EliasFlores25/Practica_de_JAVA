package ejercicio9;
import java.util.Scanner;

public class juegoConNivel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puntajeAcumulado = 0;
        System.out.println("¡Bienvenido al Juego de Preguntas!");

        System.out.println("--- Nivel 1 ---");
        System.out.println("Responda las siguientes preguntas. Puntaje: 10 por correcta, -5 por incorrecta.");

        System.out.println("1. ¿Cuál es el océano más grande del mundo?");
        System.out.print("Tu respuesta: ");
        String respuestaN1_P1 = entrada.nextLine();
        if (respuestaN1_P1.equalsIgnoreCase("Pacífico") || respuestaN1_P1.equalsIgnoreCase("Pacifico")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 10;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es Pacífico.");
            puntajeAcumulado -= 5;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);

        System.out.println("2. ¿Quién pintó la Mona Lisa?");
        System.out.print("Tu respuesta: ");
        String respuestaN1_P2 = entrada.nextLine();
        if (respuestaN1_P2.equalsIgnoreCase("Leonardo da Vinci")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 10;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es Leonardo da Vinci.");
            puntajeAcumulado -= 5;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);


        System.out.println("--- Nivel 2 ---");
        System.out.println("Responda las siguientes preguntas. Puntaje: 20 por correcta, -10 por incorrecta.");

       
        System.out.println("1. ¿Cuál es el país más grande del mundo por superficie?");
        System.out.print("Tu respuesta: ");
        String respuestaN2_P1 = entrada.nextLine();
        if (respuestaN2_P1.equalsIgnoreCase("Rusia")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 20;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es Rusia.");
            puntajeAcumulado -= 10;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);

        System.out.println("2. ¿Cuál es la capital de Australia?");
        System.out.print("Tu respuesta: ");
        String respuestaN2_P2 = entrada.nextLine();
        if (respuestaN2_P2.equalsIgnoreCase("Canberra")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 20;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es Canberra.");
            puntajeAcumulado -= 10;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);

        System.out.println("3. ¿Cuántos huesos tiene un adulto?");
        System.out.print("Tu respuesta: ");
        String respuestaN2_P3 = entrada.nextLine();
        if (respuestaN2_P3.equals("206")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 20;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es 206.");
            puntajeAcumulado -= 10;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);

        System.out.println("4. ¿Cuál es el río más largo de Sudamérica?");
        System.out.print("Tu respuesta: ");
        String respuestaN2_P4 = entrada.nextLine();
        if (respuestaN2_P4.equalsIgnoreCase("Amazonas")) {
            System.out.println("¡Correcto!");
            puntajeAcumulado += 20;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es Amazonas.");
            puntajeAcumulado -= 10;
        }
        System.out.println("Puntaje actual: " + puntajeAcumulado);


        System.out.println("--- ¡Juego Terminado! ---");
        System.out.println("Puntaje acumulado total de ambos niveles: " + puntajeAcumulado + " puntos.");

        entrada.close();
    }
}