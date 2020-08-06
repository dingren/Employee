package com.paypal.bfs.test.employeeserv.api.service;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

public interface EmployeeService {
    boolean addEmployee(Employee employee);

    Employee findById(String id);
}
