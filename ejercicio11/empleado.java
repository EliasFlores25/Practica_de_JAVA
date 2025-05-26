package ejercicio11;

class empleado extends personal {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public empleado(String nombre, String id, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando empleado: " + nombre + " con ID: " + id);
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}
