package Punto6;

import java.util.ArrayList;
import java.util.List;

public class BaseEmpleado {
    protected List<Empleado> empleados = new ArrayList<>();
    

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarTodosEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: "+ empleado.getNombre());
            System.out.println("Apellido: "+ empleado.getApellido());
            System.out.println("Sueldo"+ empleado.getSueldo());
            System.out.println("Edad: "+ empleado.getEdad());
            System.out.println("Fecha de ingreso: "+ empleado.getFechaIngreso());
            System.out.println("Id: "+ empleado.getId());
        }
    }

    public void eliminarEmpleado(int id) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                System.out.println("Se elimino el empleado con id: "+ id);
                empleados.remove(i);
                break;
            }
        }
    }

    public void buscarEmpleado(String nombre){
        for(Empleado empleado: empleados){
            if(empleado.getNombre().equals(nombre)){
            System.out.println("Nombre: "+ empleado.getNombre());
            System.out.println("Apellido: "+ empleado.getApellido());
            System.out.println("Sueldo"+ empleado.getSueldo());
            System.out.println("Edad: "+ empleado.getEdad());
            System.out.println("Fecha de ingreso: "+ empleado.getFechaIngreso());
            System.out.println("Id: "+ empleado.getId());
            break;
            }
        }
    }

    public void mostrarEmpleadosPorTipo(String tipo){
        for(Empleado empleado: empleados){
            if (tipo.equalsIgnoreCase("Vendedor")&& empleado instanceof Vendedor) {
                System.out.println("Nombre: "+ empleado.getNombre());
                System.out.println("Apellido: "+ empleado.getApellido());
                System.out.println("Sueldo"+ empleado.getSueldo());
                System.out.println("Edad: "+ empleado.getEdad());
                System.out.println("Fecha de ingreso: "+ empleado.getFechaIngreso());
                System.out.println("Id: "+ empleado.getId());
            }
            else if (tipo.equalsIgnoreCase("Administrativo")&& empleado instanceof Administrativo) {
                System.out.println("Nombre: "+ empleado.getNombre());
                System.out.println("Apellido: "+ empleado.getApellido());
                System.out.println("Sueldo"+ empleado.getSueldo());
                System.out.println("Edad: "+ empleado.getEdad());
                System.out.println("Fecha de ingreso: "+ empleado.getFechaIngreso());
                System.out.println("Id: "+ empleado.getId());
            }
            else if (tipo.equalsIgnoreCase("Operario de maestranza")&& empleado instanceof OperarioMaestranza) {
                System.out.println("Apellido: "+ empleado.getApellido());
                System.out.println("Sueldo"+ empleado.getSueldo());
                System.out.println("Edad: "+ empleado.getEdad());
                System.out.println("Fecha de ingreso: "+ empleado.getFechaIngreso());
                System.out.println("Id: "+ empleado.getId());
            }
        }
    }

    public void verCantidadEmpleados() {
        System.out.println("Cantidad de empleados: " + empleados.size());
    }


}
