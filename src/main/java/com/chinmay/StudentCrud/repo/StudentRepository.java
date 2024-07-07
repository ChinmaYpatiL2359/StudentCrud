package com.chinmay.StudentCrud.repo;

import com.chinmay.StudentCrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student findById(int id);

    Student findAllByEmailId(String emailId);

    Student findByPassword(String password);
}
