//PUNTO 23  
public class Auto {
    int ruedas;
    int puertas;
    int luces;
    public Auto(int ruedas, int puertas, int luces) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.luces = luces;
    }
    void calculoprecio() {
        System.out.println(this.ruedas*1000+this.puertas*100+this.luces*10+"$ es el precio del auto");
    }
    public static void main(String[] args) {
        Auto auto = new Auto(4, 5, 2);
        auto.calculoprecio();
    }
}
