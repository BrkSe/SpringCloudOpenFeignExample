package com.burakkutbay.studentdetail.controller;

import com.burakkutbay.studentdetail.StudentApi;
import com.burakkutbay.studentdetail.mode.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailController {

    private final StudentApi studentApi;

    public StudentDetailController(StudentApi studentApi) {
        this.studentApi = studentApi;
    }

    @GetMapping("/get-oracle-student")
    public ResponseEntity getOracleStudent() {


        StudentDto studentDto =StudentDto.builder().schoolName("ORACLE UNIVERSITY")
                .budget("2500")
                .students(studentApi.getFindByOracleUniversity()).build();


        return ResponseEntity.ok().body(studentDto);
    }

    @GetMapping("/get-eclipse-student")
    public ResponseEntity getEclipseStudent() {


        StudentDto studentDto =StudentDto.builder().schoolName("ECLIPSE UNIVERSITY")
                .budget("3500")
                .students(studentApi.getFindByEclipseUniversity()).build();


        return ResponseEntity.ok().body(studentDto);
    }


}
