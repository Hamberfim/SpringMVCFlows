package com.hamberfim.springmvcflows.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicViewController {
    // No @RequestBody, so spring maps to the method return string 'welcome-view', i.e., /resources/templates/welcome-view.html
    @RequestMapping(value= "/welcome-view")  // url route endpoint
    public String welcomeView() {
        return "welcome-View";
    }

}
