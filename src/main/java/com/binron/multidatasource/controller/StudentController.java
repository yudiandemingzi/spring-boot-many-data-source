package com.binron.multidatasource.controller;


import com.binron.multidatasource.pojo.Student;
import com.binron.multidatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * StudentController
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
    private StudentService service;
 
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addStudent(Long id,String name,Integer age) {
    	System.out.println("开始新增...");
        Student student =new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        return service.insert(student);
    }


    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Student> findByStudent(Student student) {
    	System.out.println("开始查询...");
        return service.findByListEntity(student);
    }
}
