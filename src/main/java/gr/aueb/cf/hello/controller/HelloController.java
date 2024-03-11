package gr.aueb.cf.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller()
@RequestMapping("/hello")
public class HelloController {

//    @GetMapping("/cf-index")
    @RequestMapping(path = "/cf-index", method = RequestMethod.GET)
    public String getHelloIndex(Model model) {
        model.addAttribute("cf", "Hello CF!");
        return "index";
    }

    @GetMapping("/get-hello")
    public String getHello(Model model) {
        model.addAttribute("pageName", "get-hello");
        return "demo";
    }

    @GetMapping("/get-date")
    public String getDate(Model model) {
        model.addAttribute("date", new Date());
        model.addAttribute("pageName", "get-date");
        return "date";
    }

    @GetMapping("/get-greetings")
    public String getGreetings(@RequestParam(value = "name", defaultValue = "Noname") String name, Model model) {
        model.addAttribute("name", name);
        return "greetings";
    }

    @GetMapping("/message")
    public String getMessage(Model model) {
        model.addAttribute("message", "CF message!!!!");
        return "message";
    }

//    @GetMapping("/error")
//    public String getError() {
//        return "error";
//    }
}
