package com.example.demo.service;
import java.util.ArrayList;
import com.example.demo.modal.Employee;
public interface Service {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
