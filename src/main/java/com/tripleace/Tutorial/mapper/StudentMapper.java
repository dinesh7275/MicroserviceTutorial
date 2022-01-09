package com.tripleace.Tutorial.mapper;

import com.tripleace.Tutorial.entity.StudentEntity;
import com.tripleace.Tutorial.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
   @Autowired
   private AddressMapper addressMapper;

   public StudentEntity convertModelToEntity(Student studentModel){
      if(null == studentModel){
         return null;
      }
      StudentEntity studentEntity = new StudentEntity();
      studentEntity.setFirstName(studentModel.getFirstName());
      studentEntity.setLastName(studentModel.getLastName());
      studentEntity.setStudentClass(studentModel.getStudentClass());
      studentEntity.setAddress(addressMapper.convertModelToEntity(studentModel.getAddress()));
      return studentEntity;
   }

   public Student converEntityToModel(StudentEntity studentEntity){
      if(null == studentEntity){
         return null;
      }
      Student student = new Student();
      student.setId(studentEntity.getId());
      student.setFirstName(studentEntity.getFirstName());
      student.setLastName(studentEntity.getLastName());
      student.setStudentClass(studentEntity.getStudentClass());
      student.setAddress(addressMapper.convertEntityToModel(studentEntity.getAddress()));
      return student;
   }
}
