package com.sgic16.TASK.services;

import org.springframework.beans.factory.annotation.Value;

public class SampleService {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;

    public String getAppInfo(){return "App Name:"+appName+"App Version:"+appVersion;}
}
