package com.project.attendance.services.impl;

import com.project.attendance.entities.Student;
import com.project.attendance.exception.ResourceNotFoundException;
import com.project.attendance.repositiries.StudentRepository;
import com.project.attendance.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with given id not found !!"));
    }

    @Override
    public List<Student> getStudentByGrade(String grade) {
        return studentRepository.findAllByGrade(grade);
    }
}
