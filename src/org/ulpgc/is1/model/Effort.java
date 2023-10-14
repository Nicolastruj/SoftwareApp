package org.ulpgc.is1.model;

public class Effort {
    private int amount;
    private Task task;
    private Employee employee;
    public Effort(int amount, Task task, Employee employee){
        this.amount = amount;
        this.task = task;
        this.employee = employee;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
