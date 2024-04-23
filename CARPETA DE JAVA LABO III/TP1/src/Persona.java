//PUNTO 24
public class Persona {
    private int edad;
    private String nombre;
    private String apellido;

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.edad = 20;
        persona.nombre = "Juan Roman";
        persona.apellido = "Riquelme";
        System.out.println("Hola mi nombre es " + persona.getNombre() + " " + persona.getApellido() + " y tengo " + persona.getEdad() + " años");
    }

}
