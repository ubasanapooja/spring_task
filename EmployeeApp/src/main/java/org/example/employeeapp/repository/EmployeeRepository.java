package org.example.employeeapp.repository;

import org.example.employeeapp.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // No additional code needed; MongoRepository provides basic CRUD operations
}
