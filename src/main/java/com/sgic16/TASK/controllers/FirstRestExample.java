package com.sgic16.TASK.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class FirstRestExample {

    @GetMapping("/hello-first")
    public ResponseEntity<Object>getEmployeeById(){
        return ResponseEntity.ok("Hello First API");
    }

    @GetMapping("/hash")
    public Map<String, String>CallHash(){
        Map map = new HashMap<String, String>();
        map.put("message", "Hello");
        map.put("message1", "Hello-World");
    //    map.put(1, "Thanugi");
     //   map.put(2, "Mathusan");
       // map.put(3, "Thanu");

        return map;
    }
}