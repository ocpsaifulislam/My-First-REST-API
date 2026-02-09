package com.ostad.startup.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping()
public class StudentController {
    @GetMapping("/info")
    public String info() {
        String date = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        return "Name: Md. Saiful Islam<br>" +
                "Course: Spring Boot Development<br>" +
                "Date: " + date + "<br>" +
                "Hello, fellow developers!";
    }

    @GetMapping("/goal")
    public String goal() {
        return "My goal is to learn how to build production-ready APIs.";
    }

    @GetMapping("/learning-summary")
    public String learningSummary() {
        return "I learned how to set up Java, use Spring Initializr,<br> " +
                "understand project structure, and create REST APIs.";
    }

    @GetMapping("/review")
    public String review() {
        return "The last project class was excellent;<br>"+" I suggest adding more live coding examples.";
    }

}
