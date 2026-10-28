package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getEmployees() {

        return new Employees(Arrays.asList(
                new Employee(
                        "E001",
                        "Wanda",
                        "Maximoff",
                        "wandaMax@example.com",
                        "Software Engineer"
                ),
                new Employee(
                        "E002",
                        "Hannibal",
                        "Lecter",
                        "HannibalLector49@example.com",
                        "Project Manager"
                ),
                new Employee(
                        "E003",
                        "Fujoshi",
                        "Rei",
                        "Rei_Fujo@example.com",
                        "QA Engineer"
                )
        ));
    }
}