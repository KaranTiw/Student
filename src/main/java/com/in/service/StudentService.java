package com.in.service;

import com.in.entity.StudentInf;
import com.in.repository.StudentInfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

@Autowired
private StudentInfRepository studentInfRepository;


    public StudentInf addDetails(StudentInf student) {

    return studentInfRepository.save(student);
    }

    public List<StudentInf> getStudent() {

    return studentInfRepository.findAll();
    }

    public void deleteStudent(Long id) {

    studentInfRepository.deleteById(id);

    }
}
