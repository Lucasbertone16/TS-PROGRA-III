package Punto2;

public class Motor {
    protected int cilindrada;
    protected int numeroMotor;
    protected int kilometraje;

    //constructor
    public Motor(int cilindrada, int numeroMotor, int kilometraje) {
        this.cilindrada = cilindrada;
        this.numeroMotor = numeroMotor;
        this.kilometraje = kilometraje;
    }

    //getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    } 
}
