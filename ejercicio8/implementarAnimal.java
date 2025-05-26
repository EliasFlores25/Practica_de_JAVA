package ejercicio8;

public class implementarAnimal {

    public static void main(String[] args) {
        // Creamos una instancia de la clase Animal
        Animal miAnimal = new Animal();

        // Asignamos valores a las propiedades usando los métodos setters
        miAnimal.setNombre("León");
        miAnimal.setOrden("Carnívoro");
        miAnimal.setExtremidades(4);

        // Mostramos los valores de las propiedades usando los métodos getters
        System.out.println("Información del Animal:");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        // Creamos otra instancia para demostrar
        Animal otroAnimal = new Animal();
        otroAnimal.setNombre("Águila");
        otroAnimal.setOrden("Accipitriforme");
        otroAnimal.setExtremidades(2);

        System.out.println("\nInformación del Otro Animal:");
        System.out.println("Nombre: " + otroAnimal.getNombre());
        System.out.println("Orden: " + otroAnimal.getOrden());
        System.out.println("Extremidades: " + otroAnimal.getExtremidades());
    }
}

// Clase Animal definida dentro del mismo archivo Java
class Animal {
    // Propiedades (atributos) encapsuladas
    private String nombre;
    private String orden;
    private int extremidades;

    // Constructor vacío (opcional, pero buena práctica si no hay otro constructor)
    public Animal() {
    }

    // Métodos para acceder (getters) y modificar (setters) las propiedades
    // Encapsulamiento: control de acceso a las propiedades

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        // Podemos añadir validación si es necesario, por ejemplo:
        if (extremidades >= 0) {
            this.extremidades = extremidades;
        } else {
            System.out.println("Error: El número de extremidades no puede ser negativo.");
        }
    }
}
