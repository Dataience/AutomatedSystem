/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pratima.as;

import com.Pratima.as.entity.Employee;
import com.Pratima.as.entity.dao.EmployeeDAO;
import com.Pratima.as.entity.dao.impl.EmployeeDAOImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author TigeressQueen
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {

            BufferedReader reader = new BufferedReader(new FileReader("/Users/TigeressQueen/Documents/employees.csv"));
            String line;

            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {

                String[] tokens = line.split(",");

                //  System.out.println(line);
                //  System.out.println(tokens.length);
                if (tokens.length >= 7) {
                    Employee e = new Employee(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4],
                            Integer.parseInt(tokens[5]), Boolean.parseBoolean(tokens[6]));
                    //  System.out.println(e.toString());

                    EmployeeDAO employeeDAO = new EmployeeDAOImpl();
                    employeeDAO.insert(e);
                    builder.append(e);
                    
                    String file = "/Users/TigeressQueen/Documents/ok.csv";
                    FileWriter writer = new FileWriter(file);
                    writer.write(e.toString());
                    writer.close();
       
                    for(Employee emp: employeeDAO.getAll()){
                        System.out.println(emp);
                    }
                /*        employeeDAO.getAll().forEach(emp->
                    {System.out.println(e);
                    
                    }
                    );  */
                }
                reader.close();
            }
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
