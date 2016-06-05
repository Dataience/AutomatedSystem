/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pratima.as.entity.dao.impl;

import com.Pratima.as.entity.Employee;
import com.Pratima.as.entity.dao.EmployeeDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TigeressQueen
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> employee = new ArrayList<>();

    @Override
    public boolean insert(Employee e) {
        employee.add(e);
        return true;
    }

    @Override
    public List<Employee> getAll() {
        return employee;

    }

    @Override
    public Employee getById(int id) {
        for (Employee e : employee) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
