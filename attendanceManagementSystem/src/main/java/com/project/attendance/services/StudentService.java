package com.project.attendance.services;

import com.project.attendance.entities.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    List<Student> getAllStudent();

    Student getStudent(int id);

    List<Student> getStudentByGrade(String grade);


}
