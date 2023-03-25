package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.entity.Book;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Controller
@Slf4j
@RequiredArgsConstructor
class ValidationController {

    private final Validator validator;

    @RequestMapping(value = "/validate", produces = "text/plain;charset=utf-8")
    public String validateTest(Model model) {
        Book p2 = new Book();
        Set<ConstraintViolation<Book>> violations = validator.validate(p2);
        if (!violations.isEmpty()) {
            model.addAttribute("Errors",violations);
            for (ConstraintViolation<Book> constraintViolation : violations) {
                log.error(constraintViolation.getPropertyPath() + " "
                        + constraintViolation.getMessage()); }
        } else {
            // save object
        }
        return "validateResult";
    }
}