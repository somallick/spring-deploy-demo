package com.deploy.service;

import com.deploy.entity.Student;
import com.deploy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllRawStudents() {
        return List.of(
                Student.builder().rollId(1L).name("Soumya Mallick").age(30).build(),
                Student.builder().rollId(2L).name("Bihan Kr Paul").age(2).build()
        );
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public String pushSomeStudents() {
        studentRepository.saveAll(List.of(
                Student.builder().name("Soumya Mallick").age(30).build(),
                Student.builder().name("Bihan Kr Paul").age(2).build()
        ));
        return "Done";
    }
}
