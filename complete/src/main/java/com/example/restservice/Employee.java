package com.example.restservice;
import java.util.*;
public class Employee{

    private String employee_id;
    private String employee_firstName;
    private String employee_lastName;
    private String employee_email;
    private String employee_title;


    public Employee(String id, String firstName,
        String lastName, String email, String title){
        
        this.employee_id = id;
        this.employee_firstName = firstName;
        this.employee_lastName = lastName;
        this.employee_email = email;
        this.employee_title = title;
    }

    public Employee() { // Spring boot uses a library called jackson
    // to turn incoming JSON netwrok requests into Java objects.
    // Jackson needs a default constructor to create the object before setting the fields.
    }

    public String getEmployeeId() {
        return employee_id; }
    public void setEmployeeId(String employee_id) {
        this.employee_id = employee_id; }

    public String getEmployeeFirstName() {
        return employee_firstName; }
    public void setEmployeeFirstName(String employee_firstName) {
        this.employee_firstName = employee_firstName; }

    public String getEmployeeLastName() {
        return employee_lastName; }
    public void setEmployeeLastName(String employee_lastName) {
        this.employee_lastName = employee_lastName; } 
        
    public String getEmployeeEmail() {
        return employee_email; }
    public void setEmployeeEmail(String employee_email) {
        this.employee_email = employee_email; }

    public String getEmployeeTitle() {
        return employee_title; }
    public void setEmployeeTitle(String employee_title) {
        this.employee_title = employee_title; }

    
}
