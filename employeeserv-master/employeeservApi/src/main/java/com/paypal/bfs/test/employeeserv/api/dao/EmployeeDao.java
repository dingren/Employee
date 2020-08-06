package com.paypal.bfs.test.employeeserv.api.dao;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

public interface EmployeeDao {
    /**
     * Create
     */
    @Insert("insert into t_employee(id,firstName,lastName,birthday,line1,line2,city,state,country,zipCode) values (#{id},#{firstName},#{lastName},#{birthday},#{line1},#{line2},#{city},#{state},#{country},#{zipCode})")
    void addEmployee(Employee employee);

    /**
     * retrieve
     */
    @Select("SELECT * FROM t_employee where id=#{id}")
    Employee findById(@Param("id") String id);
}
