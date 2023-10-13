package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private final int id;
    private String name;
    private String description;
    private Contract contract;
    private ArrayList<Task> tasksList;
    private static int NEXT_ID = 0;
    public Project(String name, String description, Date start, Date end, int budget){
        this.name = name;
        this.description = description;
        this.contract = new Contract(Date start, Date end, int budget);
        this.id = NEXT_ID++;
        this.tasksList = new ArrayList<Task>();
    }
    public void addTask(String name, String description, Date start, Date end, TaskType type){
        Task task = new Task(String name, String description, Date start, Date end, TaskType type);
        this.tasksList.add(task);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Date start, Date end, int budget) {
        this.contract = new Contract(Date start, Date end, int budget);
    }
    public ArrayList<Task> getTasksList(){
        return tasksList;
    }

    public void setTasksList(ArrayList<Task> tasksList) {
        this.tasksList = tasksList;
    }
}
