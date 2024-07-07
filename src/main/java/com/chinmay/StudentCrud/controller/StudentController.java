package com.chinmay.StudentCrud.controller;

import com.chinmay.StudentCrud.model.Student;
import com.chinmay.StudentCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public boolean login(@RequestBody Student student) {
        return studentService.loginStudent(student);
    }

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student) throws Exception {
        return  studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) throws Exception {
        return studentService.getStudent(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") int id) throws Exception {
        studentService.deleteStudent(id);
        return "Data Deleted for Student Id No." + id;
    }

    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id ) throws Exception {
        return studentService.updateStudent(student,id);
    }

    @GetMapping("/list")
    public List<Student> getAllStudents() throws Exception {
        return studentService.getAllStudent();

    }




}
