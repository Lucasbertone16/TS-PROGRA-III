public class Persona {
   private String nombre;
   private String apellido;
   private char sexo;
   private int edad;
   private String ciudad;

   //constructores
   public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.edad = edad;
    this.ciudad = ciudad;
   }

   public Persona(String nombre, String apellido) { //el contstuctor tiene que tener el mismo nombre que la clase
    this.nombre = nombre;
    this.apellido = apellido;
   }


   //metodos
   public void imprimirDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Sexo: " + sexo);
    System.out.println("Edad: " + edad);
    System.out.println("Ciudad: " + ciudad);
   }

   public void mayorDeEdad() {
    if (edad >= 18) {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Sexo: " + sexo);
    System.out.println("Edad: " + edad);
    System.out.println("Ciudad: " + ciudad);   
   }
   else {
    System.out.println("No es mayor de edad");
   }
}



}
