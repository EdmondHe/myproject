package org.acme.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.actuate.metrics.*;
import org.springframework.boot.actuate.health.*;

import javax.management.monitor.CounterMonitor;

@RestController
public class HelloController {


    @RequestMapping("/helei")
    public String index(){
        return "Hello Helei";
    }
}
