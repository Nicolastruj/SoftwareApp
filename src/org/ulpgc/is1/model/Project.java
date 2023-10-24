package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private final int id;
    private String name;
    private String description;
    private ProjectType projectType;
    private Contract contract;
    private ArrayList<Task> tasksList;
    private static int NEXT_ID = 0;
    private Customer customer;
    private ArrayList<Employee> developers;
    private Employee manager;

    public Project(String name, String description, ProjectType projectType, Date start, Date end, int budget, Customer customer, Employee manager){
        this.name = name;
        this.description = description;
        this.customer = customer;
        this.contract = new Contract(start, end, budget);
        this.id = NEXT_ID++;
        this.tasksList = new ArrayList<Task>();
        this.developers = new ArrayList<Employee>();
        this.manager = manager;
        this.projectType = projectType;
    }
    public void addTask(String name, String description, Date start, Date end, TaskType type){
        Task task = new Task(name, description, start, end, type);
        this.tasksList.add(task);
    }
    public void removeTask(int index){
        this.getTasksList().remove(index);
    }
    public void addDevelopers(Employee developer){
        this.developers.add(developer);
    }
    public void removeDeveloper(int index){
        this.getDevelopers().remove(index);
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
        this.contract = new Contract(start, end, budget);
    }
    public ArrayList<Task> getTasksList(){
        return tasksList;
    }

    public void setTasksList(ArrayList<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Employee> developers) {
        this.developers = developers;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Nombre de proyecto: "+name+"\nDescripcion de proyecto: "+description+"\nTipo de proyecto: "+projectType+"\nContrato:\n "+contract+"\nCliente:\n"+customer+"\nJefe:\n"+manager;
    }
}
