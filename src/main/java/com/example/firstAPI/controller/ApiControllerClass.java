package com.example.firstAPI.controller;


import com.example.firstAPI.exception.ResourceNotFoundException;
import com.example.firstAPI.service.RefreshData;
import com.example.firstAPI.util.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiControllerClass {

    LoggerUtil loggerUtil = LoggerUtil.getInstance();

    @Autowired
    private RefreshData refreshData;

    @GetMapping("/ashu")
    public String sayHello(){
        loggerUtil.logInfo(ApiControllerClass.class,"Inside ApiControllerClass");
        return "Hello";
    }

    @GetMapping("/down")
    public String serverDown(){

        throw new ResourceNotFoundException("Resource not found... ");
    }

    @GetMapping("/score")
    public String getScore(){

        return "refersh data every 10 second "+refreshData.getLatestScore();
    }
}
