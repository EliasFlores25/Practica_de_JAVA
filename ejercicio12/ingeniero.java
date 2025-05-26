package ejercicio12;

// Ingeniero.java
class ingeniero implements profesion {
    private String nombre;
    private double sueldoBase;

    public ingeniero(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}