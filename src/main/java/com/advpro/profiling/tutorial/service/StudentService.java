package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        return entityManager.createQuery(
                    "SELECT new StudentCourse(sc.student, sc.course) FROM StudentCourse sc", StudentCourse.class)
            .getResultList();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll()
                .stream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}

