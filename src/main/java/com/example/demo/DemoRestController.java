package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @RequestMapping(value = "/getMaxSatisfaction", method = RequestMethod.GET)
    public String getMaxSatisfaction()
    {
        MaximumSatisfaction maximumSatisfaction = new MaximumSatisfaction();
        return  "Maximum Satisfaction = " + maximumSatisfaction.getMaximumSatisfaction();
    }

}
