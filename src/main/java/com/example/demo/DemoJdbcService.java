package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DemoJdbcService {
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public int testJdbc() {
        return namedParameterJdbcTemplate.queryForObject("SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES", new HashMap<>(), Integer.class);
    }

}
