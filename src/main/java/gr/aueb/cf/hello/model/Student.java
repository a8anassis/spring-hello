package gr.aueb.cf.hello.model;

import gr.aueb.cf.hello.dto.StudentInsertDTO;

import java.util.Locale;

public class Student {
    private Long id;
    private String firstname;
    private String lastname;

    public Student() {}

    public Student(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
