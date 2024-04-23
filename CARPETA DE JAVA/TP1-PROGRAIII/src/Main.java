import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Persona persona = new Persona("Juan", "Perez", 'M', 20, "Saltillo");
        //Persona persona2 = new Persona("Juan", "Perez");
        //Auto auto = new Auto("Rojo", "1234", 2019, "Toyota", 100000);
        
        //persona2.imprimirDatos();

        //persona.imprimirDatos();

        //auto.encender();
       // auto.kilometrajeMayor();

       //PUNTO 9
    /*Scanner scaner= new Scanner(System.in);
    System.out.print("Ingrese el lado a: ");
    int a =scaner.nextInt();
    System.out.print("Ingrese el lado b: ");
    int b= scaner.nextInt();
    System.out.print("Ingrese el lado c: ");
    int c= scaner.nextInt();
    if (esTriangulo(a, b, c)) {
        System.out.println("Los valores "+a+","+b+","+c+" son un triangulo");
        tipoTriangulo(a, b, c);
    } else {
        System.out.println("Los valores "+a+","+b+","+c+" no son un triangulo");
    }

    

    scaner.close();/* */

    //PUNTO 1

    Scanner scaner= new Scanner(System.in);

}

public static boolean esTriangulo(int a, int b, int c) {
    return a < b + c && b < a + c && c < a + b;
}

public static void tipoTriangulo(int a, int b, int c) {
    if (a==b && b==c) {
        System.out.println("El triangulo es equilatero"); 
    }
    else if (a==b || a==c || b==c) {
        System.out.println("El triangulo es isosceles");
    }
    else{
        System.out.println("El triangulo es escaleno");
    }
}
}
