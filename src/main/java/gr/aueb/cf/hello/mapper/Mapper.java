package gr.aueb.cf.hello.mapper;

import gr.aueb.cf.hello.dto.StudentReadOnlyDTO;
import gr.aueb.cf.hello.model.Student;

public class Mapper {

    private Mapper() {}

    public static StudentReadOnlyDTO mapStudentToReadOnlyDTO(Student student) {
        return new StudentReadOnlyDTO(student.getId(), student.getFirstname(), student.getLastname());
    }
}
