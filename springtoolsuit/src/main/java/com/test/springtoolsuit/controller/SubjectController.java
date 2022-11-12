package com.test.springtoolsuit.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springtoolsuit.Service.SubjectService;
import com.test.springtoolsuit.bean.Subject;


@RestController
public class SubjectController {
@Autowired
private SubjectService subjectService;
@RequestMapping("/subjects")
public List<Subject>getAllSubject()
{
	return subjectService.getAllSubjects();
}
@RequestMapping(method=RequestMethod.POST,value="/subjects")
public void addSubject(@RequestBody Subject subject)
{
subjectService.addSubject(subject);
}
@RequestMapping(method=RequestMethod.PUT,value="/subjects{id}")
public void updateSubject(@PathVariable String id,@RequestBody Subject subject)
{
	subjectService.updateSubject(id,subject);
}
@RequestMapping(method=RequestMethod.DELETE,value="/subjects{id}")
public void DeleteSubject(@PathVariable String id)
{
	subjectService.deleteSubject(id);
	
	


}
}

