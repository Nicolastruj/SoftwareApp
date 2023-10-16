package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Task> tasksList;
    private ArrayList<Project> projectListDeveloper;
    private ArrayList<Project> projectListManager;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
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
}

