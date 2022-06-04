package com.burakkutbay.studentdetail;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "student", url = "http://localhost:8081")
public interface StudentApi {
    @GetMapping("/oracle-university")
    List<String> getFindByOracleUniversity();

    @GetMapping("/eclipse-university")
    List<String> getFindByEclipseUniversity();
}
