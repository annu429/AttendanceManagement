package com.project.attendance.repositiries;

import com.project.attendance.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByGrade(String grade);
}
