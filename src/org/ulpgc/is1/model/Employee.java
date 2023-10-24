package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Task> tasksList;
    private ArrayList<Project> projectListDeveloper;
    private ArrayList<Project> projectListManager;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.tasksList = new ArrayList<Task>();
        this.projectListDeveloper = new ArrayList<Project>();
        this.projectListManager = new ArrayList<Project>();
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

    public ArrayList<Project> getProjectListDeveloper() {
        return projectListDeveloper;
    }

    public void setProjectListDeveloper(ArrayList<Project> projectListDeveloper) {
        this.projectListDeveloper = projectListDeveloper;
    }

    public ArrayList<Project> getProjectListManager() {
        return projectListManager;
    }

    public void setProjectListManager(ArrayList<Project> projectListManager) {
        this.projectListManager = projectListManager;
    }

    public void addTask(Task task){
        this.tasksList.add(task);
    }
    public void addProjectdeveloper(Project project){
        this.projectListDeveloper.add(project);
    }
    public void removeProjectDeveloper(int index){
        this.getProjectListDeveloper().remove(index);
    }
    public void addProjectmanager(Project project){
        this.projectListManager.add(project);
    }
    public void removeProjectManager(int index){
        this.getProjectListManager().remove(index);
    }
    @Override
    public String toString() {
        return "\tNombre: "+name+"\n\tCorreo: "+email;
    }
}

