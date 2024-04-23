import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero: ");
        num=scanner.nextInt();
        int contador=1;
        int multiplicador=1;
        
        for(int i=1;i<=num;i++){
            contador=contador*multiplicador;
            multiplicador=multiplicador+1;
            System.out.println(contador);
        }
        
        System.out.println("El factorial de "+ num + " es " + contador);
        scanner.close();
    }
}
