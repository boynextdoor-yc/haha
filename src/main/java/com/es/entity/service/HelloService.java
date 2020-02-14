package com.es.entity.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Scheduled(cron = "0/5 * * * * 0-7")
    public void sayHello(){
        System.out.println("hello.....");
    }
}
