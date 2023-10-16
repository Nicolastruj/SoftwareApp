package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Task> tasksList;
    private ArrayList<Project> projectListDeveloper;
    private ArrayList<Project> projectListManager;

    public Employee(String name, String email, ArrayList<Task> tasksList, ArrayList<Project> projectListDeveloper, ArrayList<Project> projectListManager) {
        this.name = name;
        this.email = email;
        this.tasksList = tasksList;
        this.projectListDeveloper = projectListDeveloper;
        this.projectListManager = projectListManager;
    }

    public void addTask(String name, String description, Date start, Date end, TaskType type){
        Task task = new Task(name, description, start, end, type);
        this.tasksList.add(task);
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
}

