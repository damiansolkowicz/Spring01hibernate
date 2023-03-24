package pl.coderslab.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
public class Student {

    String firstName;
    String lastName;
    String gender;
    String country;
    String notes;
    boolean mailingList;
    List<String> programmingSkills;
    List<String> hobbies;


}