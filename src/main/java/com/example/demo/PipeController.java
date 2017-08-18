package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipeController {

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void pipeRequest(@RequestBody String body) {
        System.out.println(body);
    }

}
