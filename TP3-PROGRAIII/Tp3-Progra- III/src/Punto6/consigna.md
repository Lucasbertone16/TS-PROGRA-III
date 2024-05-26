EJERCICIO 6
Modelar un sistema para el área de RRHH de una empresa qué guarde información de todos los
empleados. Todos tendrán id, nombre y apellido, edad, fecha de ingreso y sueldo. Los mismos
pueden ser “Administrativo”, “Operario Maestranza” y “Vendedor” y deben extender de la clase
abstracta “Empleado”. Deberán tener un método qué muestre por pantalla qué tareas realizan.
Crear la clase “BaseEmpleados” qué contenga una lista con todos los empleados de la empresa.
Crear los métodos:
● agregarEmpleado(Empleado), para crear y cargar un nuevo empleado a la lista.
● eliminarEmpleado(id), para eliminar un empleado según un id.
● mostrarTodosLosEmpleados(), para listar por consola todos los empleados, mostrando
nombre y apellido y fecha de ingreso.
● buscarEmpleado(nombreEmpleado), para Imprimir por consola todos los datos de un
empleado dado su nombre.
● verCantidadEmpleados(), qué muestre por pantalla la cantidad de empleados qué tiene la
empresa.
● mostrarEmpleadosPorTipo(String), para mostrar por consola solo los empleados de un tipo
en particular (o administrativo, o maestranza, o vendedor).
Crear una clase qué contenga el método main() y:
● crear una lista de empleados vacia
● crear 2 empleados de cada tipo con el metodo agregarEmpleado()
● imprimir por pantalla la lista de todos los empleados
● mostrar los empleados del tipo administrativo con el metodo mostrarEmpleadosPorTipo()
● Eliminar 2 empleados
● buscar un empleado por nombre
● ver cantidad de empleados.