package ejercicio10;

class avion extends vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión vuela por el aire.");
    }

    public void despegar() {
        System.out.println("El avión está despegando.");
    }
}
