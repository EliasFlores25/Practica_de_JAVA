package registroacademico;

public class Alumno extends DatoGeneral implements ISearch{
    private String nCarnet;
    private String encargado;
    public Alumno(){}
    
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
    @Override
    public void registrar() {
        System.out.println("Registro de alumno: CLASE HIJA");
        System.out.println("Número de carnet: " + nCarnet);
        System.out.println("Encargado: " + encargado);

    }
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo datos del alumno: " );

    }
    @Override
    public int obtenerPorId(int id) {
        return 0;
    }
    @Override
    public void obtenerTodos() {
       System.out.println("Obteniendo todos los alumnos: ");
        
    }
    
}