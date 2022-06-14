package com.hamberfim.springmvcflows.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicModelMapController {
    // No @RequestBody, so spring maps to the method return string 'welcome-model-map', i.e., /resources/templates/welcome-model-map.html
    @RequestMapping(value="welcome-model-map")  // url route endpoint
    public String welcomeModelMap(ModelMap model) {
        model.put("someVarName", "${someVarName} = 'This is my var value'");
        return "welcome-model-map";
    }
}
