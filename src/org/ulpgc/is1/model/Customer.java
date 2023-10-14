package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;
    private ArrayList<Project> projectsList;
    public Customer(String name, String surname, Phone phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.projectsList = new ArrayList<Customer>();
    }
    public void addProject(Project){
        this.projectsList.add(Project);
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
