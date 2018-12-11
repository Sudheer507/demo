package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;

@SpringBootApplication
public class DemoApplication {




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
      //  MaximumSatisfaction maximumSatisfaction = new MaximumSatisfaction();
    // System.out.println(   maximumSatisfaction.getMaximumSatisfaction());
    }
}
