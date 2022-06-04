package com.burakkutbay.studentdetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = StudentDetailApplication.class)
public class StudentDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentDetailApplication.class, args);
    }

}
