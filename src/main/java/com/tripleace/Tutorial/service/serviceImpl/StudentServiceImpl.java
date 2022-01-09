package com.tripleace.Tutorial.service.serviceImpl;

import com.tripleace.Tutorial.entity.StudentEntity;
import com.tripleace.Tutorial.mapper.StudentMapper;
import com.tripleace.Tutorial.models.Student;
import com.tripleace.Tutorial.repository.StudentRepository;
import com.tripleace.Tutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        StudentEntity studentEntity = studentMapper.convertModelToEntity(student);
        StudentEntity savedEntity = studentRepository.save(studentEntity);
        Student studentResponse = studentMapper.converEntityToModel(savedEntity);
       return studentResponse;
    }

    @Override
    public List<Student> getAllStudent() {
         return studentRepository.findAll().stream().map(studentMapper::converEntityToModel).collect(Collectors.toList());

    }
}
