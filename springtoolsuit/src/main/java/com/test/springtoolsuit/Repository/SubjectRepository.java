package com.test.springtoolsuit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springtoolsuit.bean.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String>{

}
