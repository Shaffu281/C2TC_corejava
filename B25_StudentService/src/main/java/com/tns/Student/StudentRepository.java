package com.tns.Student;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.Student.Student;
@Repository
public interface StudentRepository extends JpaRepository < Student, Integer>
{

}

