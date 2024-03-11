package gr.aueb.cf.hello.rest;

import gr.aueb.cf.hello.dto.StudentReadOnlyDTO;
import gr.aueb.cf.hello.mapper.Mapper;
import gr.aueb.cf.hello.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    @GetMapping("/students")
    public ResponseEntity<List<StudentReadOnlyDTO>> getAllTeachers() {
        List<Student> studentList = List.of(new Student(1L, "Athana", "Androu"),
                            new Student(2L, "Anna", "Giannou"));

        List<StudentReadOnlyDTO> studentReadOnlyDTOS = new ArrayList<>();
        for (Student student : studentList) {
            studentReadOnlyDTOS.add(Mapper.mapStudentToReadOnlyDTO(student));
        }

//        return new ResponseEntity<>(studentReadOnlyDTOS, HttpStatus.OK);
        return ResponseEntity.ok(studentReadOnlyDTOS);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentReadOnlyDTO> getOneTeacher(@PathVariable("id") Long id) {
        Student student = new Student(id, "Athana", "Androu");

        StudentReadOnlyDTO dto = Mapper.mapStudentToReadOnlyDTO(student);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}


