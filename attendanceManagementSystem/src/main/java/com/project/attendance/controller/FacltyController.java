package com.project.attendance.controller;

import com.project.attendance.entities.Faclty;
import com.project.attendance.entities.Student;
import com.project.attendance.services.FacltyService;
import com.project.attendance.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;

@RestController
@RequestMapping("faculty")
public class FacltyController {

    @Autowired
    private FacltyService facltyService;

    @PostMapping
    public ResponseEntity<Faclty> createFaclty(@RequestBody Faclty faclty){
        return ResponseEntity.status(HttpStatus.CREATED).body(facltyService.create(faclty));
    }

    //get All student list
    @GetMapping
    public ResponseEntity<List<Faclty>> getAllFaclty(){
        return ResponseEntity.ok().body(facltyService.getAllFaclty());
    }

    // get faculty by id
    @GetMapping("{facultyId}")
    public ResponseEntity<Faclty> getFacltyById(@PathVariable int facultyId){
        return ResponseEntity.ok().body(facltyService.getFacltyById(facultyId));
    }
}
