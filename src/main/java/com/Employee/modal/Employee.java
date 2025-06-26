package com.Employee.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int Id;
    private  String name;
    private String developer;

//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getDeveloper() {
//        return developer;
//    }
//
//    public void setDeveloper(String developer) {
//        this.developer = developer;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Employee(String developer, String name, int id) {
//        this.developer = developer;
//        this.name = name;
//        Id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "Id=" + Id +
//                ", name='" + name + '\'' +
//                ", developer='" + developer + '\'' +
//                '}';
//    }
}
