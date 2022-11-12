package com.test.springtoolsuit.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springtoolsuit.Repository.SubjectRepository;
import com.test.springtoolsuit.bean.Subject;


@Service
public class SubjectService {
@Autowired
public SubjectRepository subjectRepo;
public List<Subject>getAllSubjects()
{
	List<Subject>subjects=new ArrayList<>();
	subjectRepo.findAll().forEach(subjects::add);
	return subjects;
}
public void addSubject(Subject subject)
{
	subjectRepo.save(subject);
}
public void updateSubject(String id,Subject subject)
{
	subjectRepo.save(subject);
}
public void deleteSubject(String id)
{
	subjectRepo.deleteById(id);
	
	
}
}
