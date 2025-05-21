package registroacademico;

public class Alumno extends DatoGeneral {
    private String nCarnet;
    private String encargado;
    public Alumno() {
    }
    public Alumno(String nombre, String direccion, String telefono, String email, String nCarnet, String encargado) {
        super(nombre, direccion, telefono, email);
        this.nCarnet = nCarnet;
        this.encargado = encargado;
    }
    public String getnCarnet() {
        return nCarnet;
    }
    public void setnCarnet(String nCarnet) {
        this.nCarnet = nCarnet;
    }
    public String getEncargado() {
        return encargado;
    }
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    public void verNotas() {
        System.out.println("Notas del alumno " + getNombre() + ":");
        // Aquí se pueden mostrar las notas del alumno
    }
    public void entregarTareas() {
        System.out.println("Entrega de tarea del alumno " + getNombre() + ":");
        // Aquí se puede implementar la lógica para entregar una tarea
    }
}