package com.sgic16.TASK.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import com.sgic16.TASK.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


public class SampleController {
    private final SampleService sampleService;
    public SampleController(SampleService sampleService){this.sampleService=sampleService;}

    @GetMapping("/print")
    public String print(){return  sampleService.getAppInfo();}
}
