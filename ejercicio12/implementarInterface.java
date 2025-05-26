package ejercicio12;


public class implementarInterface {

    public static void main(String[] args) {
        profesion miDoctor = new doctor("Dr. Ana López", 8000.0);
        profesion miIngeniero = new ingeniero("Ing. Carlos Ruíz", 6000.0);
        profesion miProfesor = new profesor("Mtro. Elena Díaz", 30.0, 20);

        System.out.println("--- Demostración de Interface ---");
        System.out.println(miDoctor.getNombre() + " - Sueldo calculado: $" + miDoctor.calcularSueldo());
        System.out.println(miIngeniero.getNombre() + " - Sueldo calculado: $" + miIngeniero.calcularSueldo());
        System.out.println(miProfesor.getNombre() + " - Sueldo calculado: $" + miProfesor.calcularSueldo());

        ((profesor)miProfesor).darClase();
    }
}