package com.davidjr.Dao;

import com.davidjr.Entity.Student;

import java.util.Collection;

/**
 * Created by david on 14/04/2017.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentByid(int id);

    void removeStudentByid(int id);

    void updateStudent(Student student);

    void insertStudentDb(Student student);
}
