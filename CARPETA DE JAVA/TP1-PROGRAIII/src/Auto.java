public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    //constructores
    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }

    //metodos
    public void encender() {
        System.out.println("El auto se encendió");
    }

    public void kilometrajeMayor(){
        if (km > 100000) {
            System.out.println("color: "+color);
            System.out.println("patente: "+patente);
            System.out.println("año: "+año);
            System.out.println("modelo: "+modelo);
            System.out.println("km: "+km);
        }
        else{
            System.out.println("No tiene mas de 100000 km");
        }
    }
    
}