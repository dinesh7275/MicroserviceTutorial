package com.tripleace.Tutorial.service;

import com.tripleace.Tutorial.entity.StudentEntity;
import com.tripleace.Tutorial.models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudent();
}
