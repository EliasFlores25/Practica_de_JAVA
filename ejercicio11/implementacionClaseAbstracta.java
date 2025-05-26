package ejercicio11;

public class implementacionClaseAbstracta {

    public static void main(String[] args) {
        empleado miEmpleado = new empleado("Juan Pérez", "E001", 40, 15.0);

        System.out.println("--- Demostración de Clase Abstracta ---");
        miEmpleado.registrar();
        double sueldo = miEmpleado.calcularSueldo();
        System.out.println("Sueldo calculado para " + miEmpleado.getNombre() + ": $" + sueldo);

        empleado otroEmpleado = new empleado("Ana Gómez", "E002", 35, 18.0);
        otroEmpleado.registrar();
        System.out.println("Sueldo calculado para " + otroEmpleado.getNombre() + ": $" + otroEmpleado.calcularSueldo());
    }
}
