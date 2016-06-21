package com.demograph;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oshev on 21.06.2016.
 */
@RestController
public class GreetingController {
    private  static final  String template = "Hello, %s";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(String.format(template,name));
    }
}
