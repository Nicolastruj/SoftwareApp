package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date start;
    private Date end;
    private TaskType type;
    private ArrayList<Effort> effortsList;
    public Task(String name, String description, Date start, Date end, TaskType type){
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.type = type;
        this.effortsList = new ArrayList<Effort>();
    }
    public void addEffort(int amount, Employee employee, Task task){
        Effort effort = new Effort(amount, task, employee);
        this.effortsList.add(effort);
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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }
}
