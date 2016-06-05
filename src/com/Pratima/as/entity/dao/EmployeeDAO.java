/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pratima.as.entity.dao;

import com.Pratima.as.entity.Employee;
import java.util.List;

/**
 *
 * @author TigeressQueen
 */
public interface EmployeeDAO {
    
    boolean insert(Employee e);
    List<Employee> getAll();
    Employee getById(int id);
    
    
}
