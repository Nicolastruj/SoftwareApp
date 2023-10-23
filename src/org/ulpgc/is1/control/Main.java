package org.ulpgc.is1.control;



import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.Employee;
import org.ulpgc.is1.model.Phone;
import org.ulpgc.is1.model.ProjectManager;

import java.util.Date;

;

public class Main {

    // i Init. Crear dos clientes. (*) En el caso que el cliente tenga un número de teléfono no válido se almacenará el valor: “XXXX”.
    Customer customer1 = new Customer("Luis", "Perera", new Phone("978654321"));
    Customer customer2 = new Customer("Nicolas", "Trujillo", new Phone("123456789"));

    // ii. Init. Crear dos empleados.
    Employee employee1 = new Employee("Jorge", "jorge@gmail.com");
    Employee employee2 = new Employee("Ines", "ines@gmail.com");

    // iii. Init. Crear un proyecto vinculado al primer cliente. El primer empleado será desarrollador en el proyecto. El segundo será el manager.
    Date start = new Date(2023, 10, 23);
    Date end = new Date(2024, 10, 23);
    ProjectManager projectManager = new ProjectManager("Proyecto 1", "Proyecto de prueba", start, end, 1000, customer1, employee2);
    projectManager.

    // iv. Init. Crear dos tareas vinculadas al proyecto anterior.
    project.addTask("tarea1", "descripcion1", star, end, TaskType.Analysis);
    project.addTask("tarea2", "descripcion2", star, end, TaskType.Design);

    // v. Imprimir por pantalla los datos del primer cliente.
    System.out.println("Datos del primer cliente:");
    System.out.println("Nombre: " + customer1.getName());
    System.out.println("Apellido: " + customer1.getSurname());
    System.out.println("Teléfono: " + customer1.getPhone().getNumber());

    // vi. Imprimir por pantalla los datos del segundo empleado.
    System.out.println("\nDatos del segundo empleado:");
    System.out.println("Nombre: " + employee2.getName());
    System.out.println("Email: " + employee2.getEmail());

    // vii. Imprimir por pantalla los datos del proyecto del primer cliente.
    System.out.println("\nDatos del proyecto del primer cliente:");
    System.out.println("Nombre del proyecto: " + project.getName());
    System.out.println("Descripción del proyecto: " + project.getDescription());

    // viii. Imprimir por pantalla los datos de las tareas del proyecto.
    System.out.println("\nDatos de las tareas del proyecto:");
    for (Task task : project.getTasksList()) {
        System.out.println("Tarea: " + task.getName());
        System.out.println("Descripción: " + task.getDescription());
        System.out.println("Tipo de tarea: " + task.getType());
        System.out.println();
    }

    // ix. Borrar el segundo cliente.
    customer2 = null;

    // x. Imprimir por pantalla el número de clientes
    System.out.println("\nNúmero de clientes: " + Customer.getNumberOfCustomers());

}