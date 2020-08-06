package com.paypal.bfs.test.employeeserv.api.service;


import com.paypal.bfs.test.employeeserv.api.dao.EmployeeDao;
import com.paypal.bfs.test.employeeserv.api.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public boolean addEmployee(Employee employee) {
        boolean flag=false;
        try{
            employeeDao.addEmployee(employee);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }


    @Override
    public Employee findById(String id) {
        return employeeDao.findById(id);
    }
}
