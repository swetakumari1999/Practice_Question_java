package com.Unit_Testing.controller;

import com.Unit_Testing.entity.Student;
import com.Unit_Testing.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

   @Autowired
   private StudentRepo studentRepo;

   @GetMapping
   public List<Student> getAllStudentRecord() {
      return (List<Student>) studentRepo.findAll();
   }

   @GetMapping("/{id}")
  // public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Integer id) {
     public Student getStudentById(@PathVariable(value = "id") Integer id){
      Optional<Student> student = studentRepo.findById(id);
//      return student.map(ResponseEntity::ok)
//              .orElseGet(() -> ResponseEntity.notFound().build());
      return studentRepo.findById(id).get();
   }

   @PostMapping
   public Student createStudentRecord(@RequestBody @Valid Student student_record) {
      return studentRepo.save(student_record);
   }

   @PutMapping("/{id}")
   public ResponseEntity<Student> updateStudentRecord(@PathVariable Integer id, @RequestBody @Valid Student student_record) {
      Optional<Student> optionalStudent = studentRepo.findById(id);

      if (!optionalStudent.isPresent()) {
         // Return 404 if the student is not found
         return ResponseEntity.notFound().build();
      }

      Student existingStudentRecord = optionalStudent.get();
      existingStudentRecord.setName(student_record.getName());
      existingStudentRecord.setCourse(student_record.getCourse());
      return ResponseEntity.ok(studentRepo.save(existingStudentRecord));

   }
}
