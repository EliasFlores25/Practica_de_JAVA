package ejercicio12;

class profesor implements profesion {
    private String nombre;
    private double tarifaPorHora;
    private int horasSemanales;

    public profesor(String nombre, double tarifaPorHora, int horasSemanales) {
        this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasSemanales = horasSemanales;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasSemanales * 4;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void darClase() {
        System.out.println(nombre + " está impartiendo una clase.");
    }
}