import java.util.Scanner;

public class Punto19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  palabraconcatenada;
        System.out.print("Ingrese una palabra: ");
        palabraconcatenada = "";

        while (true) {
            String palabra= scanner.nextLine();
            if (palabra.isEmpty()) {
                break;
                
            }
            palabraconcatenada = palabraconcatenada + palabra;
        }
        System.out.println("La concatenación de las palabras es: " + palabraconcatenada.trim());//el trim quita los espacios en blanco al inicio y al final del string
        scanner.close();
    }
}
