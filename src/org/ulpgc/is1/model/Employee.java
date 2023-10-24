package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Task> tasksList;
    private ArrayList<Project> projectListDeveloped;
    private ArrayList<Project> projectListManaged;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.tasksList = new ArrayList<Task>();
        this.projectListDeveloped = new ArrayList<Project>();
        this.projectListManaged = new ArrayList<Project>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(ArrayList<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public ArrayList<Project> getProjectListDeveloped() {
        return projectListDeveloped;
    }

    public void setProjectListDeveloped(ArrayList<Project> projectListDeveloped) {
        this.projectListDeveloped = projectListDeveloped;
    }

    public ArrayList<Project> getProjectListManaged() {
        return projectListManaged;
    }

    public void setProjectListManaged(ArrayList<Project> projectListManaged) {
        this.projectListManaged = projectListManaged;
    }

    public void addTask(Task task){
        this.tasksList.add(task);
    }
    public void removeTask(int index){
        this.tasksList.remove(index);
    }
    public void addProjectDeveloped(Project project){
        if (projectListDeveloped.contains(project) == false) {//Esto es una restriccion
            this.projectListDeveloped.add(project);
        }
    }
    public void removeProjectDeveloped(int index){
        this.getProjectListDeveloped().remove(index);
    }
    public void addProjectmanaged(Project project){
        this.projectListManaged.add(project);
    }
    public void removeProjectManaged(int index){
        this.getProjectListManaged().remove(index);
    }
    @Override
    public String toString() {
        return "\tNombre: "+name+"\n\tCorreo: "+email;
    }
}

