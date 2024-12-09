package com.SJ.studentManagement.repository;

import com.SJ.studentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
