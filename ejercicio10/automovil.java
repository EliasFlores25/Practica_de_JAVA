package ejercicio10;

class automovil extends vehiculo {
    @Override
    public void mover() {
        System.out.println("El automóvil avanza sobre ruedas.");
    }

    public void encenderMotor() {
        System.out.println("El automóvil enciende su motor.");
    }
}
