import java.util.Scanner;

public class Punto16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double millas;

        do {
            System.out.println("Ingrese el numero de millas: ");
            millas = scanner.nextDouble();
            if (millas != 0) {
                double kilometros= millas * 1.60931;
                String resultado = String.format("El equivalente a %.2f millas son %.2f Km (Si desea salir ingrese 0)", millas, kilometros);
                System.out.println(resultado); //con el %2.2f se redondea a 2 decimales
                //el string.format es un metodo que permite dar formato a un string en este caso le dimos el formato de 2 decimales y el resultado de la operacion
            }
        } while (millas != 0);
        scanner.close();
}
}
    


