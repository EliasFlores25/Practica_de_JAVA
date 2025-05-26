package ejercicio12;

class doctor implements profesion {
    private String nombre;
    private double salarioMensual;

    public doctor(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
