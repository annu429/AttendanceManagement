package com.project.attendance.controller;

import com.project.attendance.entities.Student;
import com.project.attendance.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(student));
    }

    //get All student list
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok().body(studentService.getAllStudent());
    }

    // get student by id
    @GetMapping("{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId){
        return ResponseEntity.ok().body(studentService.getStudent(studentId));
    }

    // get All student by grade
    @GetMapping("/class/{grade}")
    public ResponseEntity<List<Student>> getStudentByGrade(@PathVariable String grade){
        return ResponseEntity.ok().body(studentService.getStudentByGrade(grade));
    }
}
