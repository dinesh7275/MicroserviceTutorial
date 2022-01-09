package com.tripleace.Tutorial.controller;

import com.tripleace.Tutorial.models.Student;
import com.tripleace.Tutorial.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        log.info("stated saving student {}",student);
        return studentService.saveStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


}
