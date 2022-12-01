package com.tns.Student;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.Student.Student;
import com.tns.Student.StudentService;

@RestController
public class StudentController
{
   private static final Student Student = null;
@Autowired
   private StudentService service;
   
   // RESTful API methods for Retrieval operations
   @GetMapping("/Student")
   public List<Student> list() {
       return service.listAll();
   }
   @GetMapping("/Student/{id}")

   public ResponseEntity<Student> get(@PathVariable Integer id) {
       try {
    	   Student user = service.get(id);
           return new ResponseEntity<Student>(Student, HttpStatus.OK);
       } catch (NoSuchElementException e) {
           return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
       }      
   }
   // RESTful API method for Create operation
   @PostMapping("/Student")
   public void add(@RequestBody Student user) {
       service.save(Student);
   }
   
   // RESTful API method for Update operation
   @PutMapping("/Student/{id}")
   public ResponseEntity<?> update(@RequestBody Student user, @PathVariable Integer id) {
       try {
    	   Student existStudent = service.get(id);
           service.save(Student);
           return new ResponseEntity<>(HttpStatus.OK);
       } catch (NoSuchElementException e) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }      
   }
   // RESTful API method for Delete operation
   @DeleteMapping("/Student/{id}")
   public void delete(@PathVariable Integer id) {
       service.delete(id);
   }
   
 
}