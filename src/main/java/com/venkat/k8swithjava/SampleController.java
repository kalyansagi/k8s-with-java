package com.venkat.k8swithjava;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Venkata Kalyan
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String greet() {
        return "Hello World!!";
    }
}