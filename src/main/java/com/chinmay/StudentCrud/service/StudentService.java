package com.chinmay.StudentCrud.service;

import com.chinmay.StudentCrud.model.Student;

import java.util.List;

public interface StudentService {

    public Student createStudent(Student student) throws Exception;
    public Student getStudent(int id) throws Exception;
    public void deleteStudent(int id) throws Exception;
    public Student updateStudent(Student student, int id) throws Exception;

    public List<Student> getAllStudent() throws Exception;

    boolean loginStudent(Student student);
}
