package com.example.basicDataSourceDemo.Model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;

    public Student(String name, String passportNumber){
        this.name = name;
        this.passportNumber = passportNumber;
    }



}
