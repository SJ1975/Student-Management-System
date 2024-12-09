package com.SJ.studentManagement.service;


import com.SJ.studentManagement.model.Student;
import com.SJ.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setRollNumber(student.getRollNumber());
            existingStudent.setGrade(student.getGrade());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}