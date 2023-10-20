package org.ulpgc.is1.model;

import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class ProjectManager {

    private ArrayList<Employee> employeeList;
    private ArrayList<Customer> customerList;
    private Project project;

    public ProjectManager(String name, String description, Date start, Date end, int budget, Customer customer, Employee manager) {
        this.employeeList = new ArrayList<Employee>();
        this.customerList = new ArrayList<Customer>();
        this.project = project(String name, String description, Date start, Date end, int budget, Customer customer, Employee manager);
    }
    public Project project(String name, String description, Date start, Date end, int budget, Customer customer, Employee manager){
        return new Project(String name, String description, Date start, Date end, int budget, Customer customer, Employee manager);
    }

    public ArrayList<Employee> getEmployeeList() {
        return this. employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Customer> getCustomerList() {
        return this.customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }


    public Customer getCustomer(int index){
        return this.customerList.get(index);
    }

    public Employee getEmployee(int index){
        return this.employeeList.get(index);
    }

    public void addCustomer(String name, String surname, String phone){
        Customer customer = new Customer(name, surname, phone);
        customerList.add(customer);
    }
    public void removeCustomer(int index){
        this.getCustomerList().remove(index);
    }
    public void addEmployee(String name, String email){
        Employee employee =new Employee(name, email);
        employeeList.add(employee);
    }
    public void removeEmployee(int index){
        this.getEmployeeList().remove(index);
    }
    public Project project(){
        return project();
    }

}
