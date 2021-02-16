package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class DemoJdbcController {

    @Autowired
    private DemoJdbcService demoJdbcService;

    @PostMapping("/savecountries")
    public void saveCountries(@RequestBody List<Country> countries) {
        demoJdbcService.saveCountries(countries);
    }


}
