package ejercicio10;


public class polimorfismoVehiculo {

    public static void main(String[] args) {
       
        vehiculo miAutomovil = new automovil();
        vehiculo miBarco = new barco();
        vehiculo miAvion = new avion();

        System.out.println("--- Demostración de Polimorfismo ---");
        miAutomovil.mover();
        miBarco.mover();
        miAvion.mover();

        System.out.println("\n--- Métodos Específicos de las Clases Derivadas ---");
        ((automovil)miAutomovil).encenderMotor();
        ((barco)miBarco).sonarSirena();
        ((avion)miAvion).despegar();
    }
}