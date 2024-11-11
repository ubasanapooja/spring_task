package org.example.employeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "Employee API",
        version = "1.0",
        description = "API for Employee Management"
))
public class EmployeeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeAppApplication.class, args);
    }
}

