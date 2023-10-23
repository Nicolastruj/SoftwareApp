package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;
    private ArrayList<Project> projectsList;
    public Customer(String name, String surname, Phone phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.projectsList = new ArrayList<Project>();
    }
    public void addProject(String name, String description, Date start, Date end, int budget, Customer customer, Employee manager){
        Project project = new Project( name, description, start, end, budget, customer, manager);
        this.projectsList.add(project);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public ArrayList<Project> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(ArrayList<Project> projectsList) {
        this.projectsList = projectsList;
    }
}
