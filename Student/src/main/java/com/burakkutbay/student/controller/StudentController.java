package com.burakkutbay.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("oracle-university")
    public List<String> getFindByOracleUniversity(){
        return Arrays.asList("Burak","Ahmet","Mehmet","Veli");
    }

    @GetMapping("eclipse-university")
    public List<String> getFindByEclipseUniversity(){
        return Arrays.asList("Ali","Hakkı","Buğra","Kaya");
    }
}
