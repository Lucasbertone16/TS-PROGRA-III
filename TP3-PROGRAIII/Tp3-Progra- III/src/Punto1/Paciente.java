package Punto1;
public class Paciente {
    protected long dni;
    protected String nombre;
    protected String apellido;
    protected boolean necesitaInternacion;
    
    public Paciente(long dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.necesitaInternacion = false;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isNecesitaInternacion() {
        return necesitaInternacion;
    }

    public void setNecesitaInternacion(boolean necesitaInternacion) {
        this.necesitaInternacion = necesitaInternacion;
    }
}
