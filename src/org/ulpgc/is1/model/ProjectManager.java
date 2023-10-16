package org.ulpgc.is1.model;

import java.time.Period;
import java.util.ArrayList;

public class ProjectManager {

    private ArrayList<Employee> employeeList;
    private ArrayList<Customer> customerList;

    public ProjectManager(ArrayList<Employee> employeeList, ArrayList<Customer> customerList) {
        this.employeeList = employeeList;
        this.customerList = customerList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public Customer getCustomer(int index){
        return customerList.get(index);
    }

    public Employee getEmployee(int index){
        return employeeList.get(index);
    }

    public Project project(){
        return project();
    }

}
