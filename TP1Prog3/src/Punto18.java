import java.util.Scanner;

public class Punto18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 7(Le dire el dia de la semana y ademas le dira si es un dia laboral o no): ");
        int numero = scanner.nextInt();

        String dia;
        String tipodedia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia no existente";
                break;
        }

        switch (numero) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipodedia = "Se trabaja";
                break;
            case 6:
            case 7:
                tipodedia = "Finde";
                break;
            default:
                tipodedia = "Desconocido";
                break;
        }

        System.out.println("El día correspondiente al número ingresado es: " + dia);
        System.out.println("Tipo de día: " + tipodedia);

        scanner.close();
    }
    
}
