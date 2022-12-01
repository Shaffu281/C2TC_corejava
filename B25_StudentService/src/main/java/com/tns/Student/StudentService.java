package com.tns.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.Student.Student;
import com.tns.Student.StudentRepository;
@Service
@Transactional
public class StudentService {

@Autowired
private StudentRepository repo;

public List<Student> listAll()
{

return repo.findAll();
}

public Student get(Integer id) {
// TODO Auto-generated method stub
return repo.findById(id).get();
}

public void save(Student student) {
// TODO Auto-generated method stub
repo.save(student);
}

public void delete(Integer id) {
// TODO Auto-generated method stub
repo.deleteById(id);
}

}