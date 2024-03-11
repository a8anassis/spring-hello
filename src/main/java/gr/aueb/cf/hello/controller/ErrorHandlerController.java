package gr.aueb.cf.hello.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;


import java.util.Locale;

@ControllerAdvice
public class ErrorHandlerController {

    private final MessageSource messageSource;
    private MessageSourceAccessor accessor;

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource, Locale.getDefault());
    }

    @Autowired
    public ErrorHandlerController(MessageSource messageSource) {
        this.messageSource = messageSource;

    }

    @ExceptionHandler({NoResourceFoundException.class})
    public String handleException(NoResourceFoundException ex, Model model) {
        model.addAttribute("message", accessor.getMessage("error.generic"));
        return "/error";
    }
}


