package ejercicio10;

class barco extends vehiculo {
    @Override
    public void mover() {
        System.out.println("El barco navega sobre el agua.");
    }

    public void sonarSirena() {
        System.out.println("El barco suena su sirena: ¡Puuu-Puuu!");
    }
}