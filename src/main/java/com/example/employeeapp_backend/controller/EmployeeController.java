package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String HomePage(){
        return "this is my homepage";
    }
    @GetMapping("/add")
    public String AddPage(){
        return "this is my addpage";
    }
    @GetMapping("/search")
    public String SearchPage(){
        return "this is my searchpage";
    }
    @GetMapping("/edit")
    public String EditPage(){
        return "this is my editpage";
    }
    @GetMapping("/view")
    public String ViewPage(){
        return "this is my viewpage";
    }
    @GetMapping("/delete")
    public String DeletePage(){
        return "this is my deletepage";
    }
}
