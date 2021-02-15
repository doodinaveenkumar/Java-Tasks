package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJdbcController {

    @Autowired
    private DemoJdbcService demoJdbcService;

    @GetMapping("/testJdbc")
    public int testJdbc() {
        return demoJdbcService.testJdbc();
    }


}
