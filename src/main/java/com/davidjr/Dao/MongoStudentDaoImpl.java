package com.davidjr.Dao;

import com.davidjr.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by david on 14/04/2017.
 */
@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Mario", "northing"));
            }
        };
    }

    @Override
    public Student getStudentByid(int id) {
        return null;
    }

    @Override
    public void removeStudentByid(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentDb(Student student) {

    }
}
