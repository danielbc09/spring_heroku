package cc.hito_2.ejercicios.cc_hito_2_ejercicios.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
            return "Hello world";
    }
}
