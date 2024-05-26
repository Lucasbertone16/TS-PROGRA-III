package Punto1;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    protected  List<Paciente> pacientes = new ArrayList<>();
    protected int numeroCamas;
    protected boolean estaLlena;
    
    //constructor
    public Habitacion(List<Paciente> pacientes, int numeroCamas, boolean estaLlena) {
        this.pacientes = pacientes;
        this.numeroCamas = numeroCamas;
        this.estaLlena = estaLlena;
    }
    

    //metodos
    public void internarPaciente(Paciente paciente) {
        if (estaLlena()==false) {
            pacientes.add(paciente);
            paciente.setNecesitaInternacion(true);
        }
        else {
            System.out.println("La habitacion esta llena");
        }
    }

    public void darAltaPaciente(Paciente paciente) {
        if (estaLlena()==false) {
            pacientes.remove(paciente);
            paciente.setNecesitaInternacion(false);
        }
        else {
            System.out.println("La habitacion esta llena");
        }
    }

    public boolean estaLlena() {
       if (this.pacientes.size() == this.numeroCamas) {
           return true;
       } else {
           return false;
       }
    }
  

    //getters setters
    public List<Paciente> getPacientes() {
        return pacientes;
    }


    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }


    public int getNumeroCamas() {
        return numeroCamas;
    }


    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }


    public boolean isEstaLlena() {
        return estaLlena;
    }


    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    

    

}
