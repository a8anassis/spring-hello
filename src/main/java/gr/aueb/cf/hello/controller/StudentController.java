package gr.aueb.cf.hello.controller;

import gr.aueb.cf.hello.dto.StudentInsertDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/student/add")
    public String getStudentForm(Model model) {
        model.addAttribute("studentInsertDTO", new StudentInsertDTO());
        return "student/insert";
    }

    @PostMapping("/student/add")
    public String addStudent(@ModelAttribute("studentInsertDTO") StudentInsertDTO dto, Model model) {
        model.addAttribute("dto", dto);
        return "student/success";
    }
}
