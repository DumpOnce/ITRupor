package com.example.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class ControllerR
{

    @GetMapping("/{id}")
    public String getMap(@PathVariable("id") int id)
    {
        return id+"streve";
    }
}
