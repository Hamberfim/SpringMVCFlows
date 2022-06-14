package com.hamberfim.springmvcflows.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicModelViewController {
    @RequestMapping("/welcome-model-view")  // url route endpoint
    public ModelAndView welcomeModelViewController(ModelMap model) {
        // No @RequestBody, so spring maps to the method return ModelAndView 'welcome-model-view', i.e., /resources/templates/welcome-model-view.html
        model.put("myVarName", "${myVarName} = 'myVarValue'");
        return new ModelAndView("welcome-model-view", model);

    }
}
