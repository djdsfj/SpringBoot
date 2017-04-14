package com.davidjr.Controller;

import com.davidjr.Entity.Student;
import com.davidjr.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by david on 14/04/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {


@Autowired
private StudentService studentService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentByid(@PathVariable("id")int id){
return studentService.getStudentByid(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentByid(@PathVariable("id")int id){
        studentService.removeStudentByid(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentByid(@RequestBody Student student){
        studentService.updateStudent(student);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentByid(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
