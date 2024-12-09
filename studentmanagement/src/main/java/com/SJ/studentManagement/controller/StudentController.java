package com.SJ.studentManagement.controller;


import com.SJ.studentManagement.model.Student;
import com.SJ.studentManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student addStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
        return ResponseEntity.ok(studentService.addStudent(student));
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

}
