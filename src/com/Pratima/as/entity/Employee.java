/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pratima.as.entity;

/**
 *
 * @author TigeressQueen
 */
public class Employee {
    
   int id;
   String firstname, lastname, email, contacts;
   int salary;
   Boolean status;

    public Employee() {
    }

    public Employee(int id, String firstname, String lastname, String email, String contacts, int salary, Boolean status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contacts = contacts;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", contacts=" + contacts + ", salary=" + salary + ", status=" + status + '}';
    }
   
      
}
