package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
//    @RequestMapping("/h1")
    public List<Student> getAllStudents(){
//        return "helloWorld1111";
        return studentService.getAllStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added!";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated!";
    }

    @DeleteMapping(path ="{id}")
    public String deleteStudent(@PathVariable("id")UUID id){
        studentService.deleteStudent(id);
        return "delete";
    }



//    @GetMapping
//    @RequestMapping("/h2")
//    public String helloWorld2(){
//        return "helloWorld22222";
//    }

}
