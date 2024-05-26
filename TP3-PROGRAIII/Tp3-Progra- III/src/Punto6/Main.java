package Punto6;

public class Main {
    public static void main(String[] args) {
        BaseEmpleado baseEmpleado = new BaseEmpleado();

        // Crear 2 empleados de cada tipo
        Vendedor vendedor1 = new Vendedor(1, "Carlos", "González", 2000.0, 30, "01/01/2020");
        Vendedor vendedor2 = new Vendedor(2, "Laura", "Martínez", 2200.0, 28, "02/02/2021");
        OperarioMaestranza operario1 = new OperarioMaestranza(3, "Pedro", "Pérez", 1800.0, 40, "03/03/2019");
        OperarioMaestranza operario2 = new OperarioMaestranza(4, "Ana", "López", 1900.0, 35, "04/04/2018");
        Administrativo administrativo1 = new Administrativo(5, "Marta", "Ramírez", 2500.0, 45, "05/05/2017");
        Administrativo administrativo2 = new Administrativo(6, "Javier", "Fernández", 2600.0, 50, "06/06/2016");

        // Agregar empleados a la lista
        baseEmpleado.agregarEmpleado(vendedor1);
        baseEmpleado.agregarEmpleado(vendedor2);
        baseEmpleado.agregarEmpleado(operario1);
        baseEmpleado.agregarEmpleado(operario2);
        baseEmpleado.agregarEmpleado(administrativo1);
        baseEmpleado.agregarEmpleado(administrativo2);

        // Imprimir todos los empleados
        System.out.println("\nLista de todos los empleados:");
        baseEmpleado.mostrarTodosEmpleados();

        System.out.println("\nEmpleados del tipo administrativo");
        baseEmpleado.mostrarEmpleadosPorTipo("Administrativo");

        System.out.println("\nElimimando empleado con id 1 y 3");
        baseEmpleado.eliminarEmpleado(1); // Eliminar vendedor1
        baseEmpleado.eliminarEmpleado(3); // Eliminar operario1

        // Imprimir todos los empleados después de eliminación
        System.out.println("\n\n\nLista de todos los empleados después de eliminar dos:");
        baseEmpleado.mostrarTodosEmpleados();

        // Buscar un empleado por nombre
        System.out.println("\n\n\nBuscando a Ana");
        baseEmpleado.buscarEmpleado("Ana");

        // Ver cantidad de empleados
        baseEmpleado.verCantidadEmpleados();
    }
}
