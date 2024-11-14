package com.in.controller;


import com.in.entity.StudentInf;
import com.in.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public String addDetails(@RequestBody StudentInf student){

        studentService.addDetails(student);
        return"Successfully added";
    }


    @GetMapping("/getAll")

     public List<StudentInf> getAllStudentInf()
    {

         List<StudentInf> stu=studentService.getStudent();

        return stu;
    }

    @DeleteMapping("/students")

    public String deleteStudent(@PathVariable Long id){

        studentService.deleteStudent(id);


        return"done";
    }
}
