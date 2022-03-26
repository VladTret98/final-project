package by.tretiak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/")
    public String getLoginPage() {
        return "index";
    }

}
