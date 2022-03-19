package com.example.control;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    @PreAuthorize("")
    public String getMainPage(){
        return "/Entry/EntryPage.html";//??
    }

    @PostAuthorize("")
    public String getMainPage2(){
        return "/Entry/EntryPage.html";//??
    }
}
