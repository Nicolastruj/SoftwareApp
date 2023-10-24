package org.ulpgc.is1.control;


import org.ulpgc.is1.model.*;

import java.util.Calendar;
import java.util.Date;

public class Main {

    private static void init(ProjectManager projectManager){
        //Primer paso
        projectManager.addCustomer("Nicolas", "Trujillo", new Phone("461"));
        projectManager.addCustomer("Luis", "Perera", new Phone("5468"));

        //Segundo paso
        projectManager.addEmployee("Elisa", "elisa@gmail.com");
        projectManager.addEmployee("Adolfo", "adolfo@gmail.com");

        //Tercer paso
        projectManager.project("Proyecto1", "Proyecto de prueba", ProjectType.Mobil_app_development ,new Date(2023, Calendar.JANUARY, 1), new Date(123, Calendar.DECEMBER, 31), 1000, projectManager.getCustomerList().get(0), projectManager.getEmployeeList().get(1));
        projectManager.getProject().addDevelopers(projectManager.getEmployeeList().get(0));
        projectManager.getEmployeeList();

        //Cuarto paso
        projectManager.getProject().addTask("Primera tarea","Primera tarea de prueba", new Date(123, Calendar.JANUARY, 1), new Date(123, Calendar.OCTOBER, 1), TaskType.Design);
        projectManager.getProject().addTask("Segunda tarea","Segunda tarea de prueba", new Date(123, Calendar.OCTOBER, 2), new Date(123, Calendar.DECEMBER, 31), TaskType.Test);
    }

    public static void main(String[] args){
        ProjectManager projectManager = new ProjectManager();
        init(projectManager);

        // Paso 5
        System.out.println("\nDatos del primer cliente: ");
        System.out.println(projectManager.getProject().getCustomer().toString());

        // Paso 6
        System.out.println("\nDatos del segundo empleado: ");
        System.out.println(projectManager.getProject().getDevelopers().get(0).toString());

        // Paso 7
        System.out.println("\nDatos del proyecto del primer cliente: ");
        System.out.println(projectManager.getProject().toString());

        // Paso 8
        System.out.println("\nDatos de las tareas del proyecto: ");
        for (Task task : projectManager.getProject().getTasksList()) {
            System.out.println(task.toString());
        }

        // Paso 9
        projectManager.removeCustomer(1);

        // Paso 10
        System.out.println("\nNúmero de clientes: " + projectManager.getCustomerList().size());

    }
}
