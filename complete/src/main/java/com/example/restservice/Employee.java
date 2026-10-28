package com.example.restservice;
import java.util.*;
public class Employee{


    private final String employee_id;
    private final String employee_firstName;
    private final String employee_lastName;
    private final String employee_email;
    private final String employee_title;


    public Employee(String id, String firstName,
        String lastName, String email, String title){
        
        this.employee_id = id;
        this.employee_firstName = firstName;
        this.employee_lastName = lastName;
        this.employee_email = email;
        this.employee_title = title;
    }

    public String getEmployee_id() {
        return employee_id; }

    public String getEmployee_firstName() {
        return employee_firstName; }

    public String getEmployee_lastName() {
        return employee_lastName; }
    
    public String getEmployee_email() {
        return employee_email; }

    
    public String getEmployee_title() {
        return employee_title; }
    }