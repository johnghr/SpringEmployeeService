package com.example.codeclan.employees.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_of_days")
    private int numberOfDays;

    @ManyToMany
    @JsonIgnoreProperties({"projects"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Employee> employees;

    public Project(String name, int numberOfDays, List<Employee> employees) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.employees = new ArrayList<>();
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
