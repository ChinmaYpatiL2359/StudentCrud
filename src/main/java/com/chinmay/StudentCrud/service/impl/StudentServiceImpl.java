package com.chinmay.StudentCrud.service.impl;

import com.chinmay.StudentCrud.exception.ResouresNotFoundException;
import com.chinmay.StudentCrud.model.Student;
import com.chinmay.StudentCrud.repo.StudentRepository;
import com.chinmay.StudentCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) throws Exception {
        Student current = this.studentRepository.findAllByEmailId(student.getEmailId());

        if(current != null) {
            System.out.println("Student is already there !!");
            throw new ResouresNotFoundException("Student Email {"+ current.getEmailId()+"} Already Present");
        } else {
            this.studentRepository.save(student);
        }
        return current;
    }


    @Override
    public Student getStudent(int id) throws Exception {

        return this.studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(int id) throws Exception {
        this.studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student, int id) {

        Student studentTemp = studentRepository.findById(id);

        studentTemp.setEmailId(student.getEmailId());
        studentTemp.setCollageName(student.getCollageName());
        studentTemp.setFirstName(student.getFirstName());
        studentTemp.setLastName(student.getLastName());
        studentTemp.setMobileNumber(student.getMobileNumber());
        studentTemp.setRollNumber(student.getRollNumber());
        studentTemp.setPassword(student.getPassword());
        studentTemp.setAddress(student.getAddress());

        return this.studentRepository.save(studentTemp);
    }

    public List<Student> getAllStudent() throws Exception {
        return studentRepository.findAll();
    }

    @Override
    public boolean loginStudent(Student student) {
      //Student stdEmail = studentRepository.findAllByEmailId(student.getEmailId());

        boolean flag = false;
        String email = student.getEmailId();
        String pass = student.getPassword();

        List<Student> studentList = studentRepository.findAll();

        for (Student studentData: studentList){
            if(studentData.getEmailId() != null && studentData.getPassword() != null) {
                if (email.equals(studentData.getEmailId()) && pass.equals(studentData.getPassword())) {
                    flag = true;
                }
            }


        }

        return flag;
    }



    }
