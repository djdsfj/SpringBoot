package com.davidjr.Service;

import com.davidjr.Dao.FakeStudentDaoImpl;
import com.davidjr.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by david on 14/04/2017.
 */
@Service
public class StudentService {
    @Autowired
    @Qualifier("mongoData")
    private FakeStudentDaoImpl fakeStudentDaoImpl;
    public Collection<Student> getAllStudents(){
        return this.fakeStudentDaoImpl.getAllStudents();
    }



    public Student getStudentByid(int id) {
        return this.fakeStudentDaoImpl.getStudentByid(id);
    }

    public void removeStudentByid(int id) {
        this.fakeStudentDaoImpl.removeStudentByid(id);
    }
    public void updateStudent(Student student){
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student){
this.fakeStudentDaoImpl.insertStudentDb(student);
    }

}