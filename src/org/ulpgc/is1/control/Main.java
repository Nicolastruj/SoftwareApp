package org.ulpgc.is1.control;


import org.ulpgc.is1.model.*;

import java.util.Date;

public class Main {

    private static void init(ProjectManager projectManager){
        //Primer paso
        projectManager.addCustomer("Nicolas", "Trujillo", new Phone("123456789"));
        projectManager.addCustomer("Luis", "Perera", new Phone("987654321"));

        //Segundo paso
        projectManager.addEmployee("Elisa", "elisa@gmail.com");
        projectManager.addEmployee("Adolfo", "adolfo@gmail.com");

        //Tercer paso
        Employee employee = projectManager.getEmployeeList().get(1);
        Customer
        projectManager.project("Proyecto1", "Proyecto de prueba", new Date(123, 1, 1), new Date(123, 30, 12), 1000, projectManager.getCustomerList().get(0), projectManager.getEmployeeList().get(1));
        projectManager.getCustomerList().add(customer1);
        projectManager.getProject().addDevelopers(projectManager.getEmployeeList().get(0));
        projectManager.getEmployeeList()

        //Cuarto paso
        Date task1DateOne = new Date(123, 1, 1);
        Date task1DateTwo = new Date(123, 6, 1);
        projectManager.getProject().addTask("Primera tarea","Primera tarea de prueba", task1DateOne, task1DateTwo, TaskType.Design);
        projectManager.getProject().addTask("Segunda tarea","Segunda tarea de prueba", task1DateOne, task1DateTwo, TaskType.Test);
    }

    public static void main(String[] args){
        ProjectManager projectManager = new ProjectManager();
        init(projectManager);
        System.out.println(projectManager.getProject().getCustomer().toString());
        System.out.println(projectManager.getProject().getDevelopers().get(0).toString());

    }
}
