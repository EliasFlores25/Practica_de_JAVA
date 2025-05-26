package ejercicio11;

abstract class personal {
    protected String nombre;
    protected String id;

    public personal(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract void registrar();
    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}