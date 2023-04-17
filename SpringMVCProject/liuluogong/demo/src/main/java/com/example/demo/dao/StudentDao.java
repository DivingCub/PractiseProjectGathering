package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;



public interface StudentDao {


    Optional<Student> selectStudentById(UUID id);

    List<Student> selectAllStudents();
    //查询的写法
    int insertStudent( Student student);
    //增加insert的方法实现

    int updateStudent(Student student);


    int deleteStudent(UUID id);


}
