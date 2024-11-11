package org.example.employeeapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees") // Collection name in MongoDB
public class Employee {
    @Id
    private String id; // Employee ID
    private String name; // Employee Name
    private String email; // Employee Email
    private String location; // Employee Location

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    // Constructor, toString, etc. (Optional)
}
