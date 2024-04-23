public class Celular {
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    public Celular(String modelo, String marca, int memoria, boolean radio, int nroCelular) {
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

    //metodos
    public void realizarLlmada() {
        System.out.println("Llamando...");
    }

    public void cortarLlamada(){
        System.out.println("Llamada Terminada");
    }

    
}
