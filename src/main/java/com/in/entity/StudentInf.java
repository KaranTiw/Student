package com.in.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student_inf")
public class StudentInf {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name",nullable = false,length = 100)
private String name;

    @Column(name="email",nullable = false,length = 100,unique = true)

    private String email;

    @Column(name="mobile",nullable = false,length = 100,unique = true)

    private String mobile;

    
}