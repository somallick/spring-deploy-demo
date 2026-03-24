package com.deploy.controller;

import com.deploy.entity.Student;
import com.deploy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all-raw-stud")
    public ResponseEntity<List<Student>> getAllRawStudents() {
        return ResponseEntity.ok(studentService.getAllRawStudents());
    }

    @GetMapping("/all-stud")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/push-stud")
    public ResponseEntity<String> pushAllStudents() {
        return ResponseEntity.ok(studentService.pushSomeStudents());
    }

}