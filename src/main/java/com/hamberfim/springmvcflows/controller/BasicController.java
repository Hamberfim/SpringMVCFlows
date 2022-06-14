package com.hamberfim.springmvcflows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    // handle all root url requests
    @RequestMapping(value="/")
    @ResponseBody
    public String index() {
        return "<h4>This is the root directory page.</h4>" +
                "Try: " +
                "<br /><a href=\"/welcome\" />/welcome</a> " +
                "<br /><a href=\"/welcome-model-map\" />/welcome-model-map</a> " +
                "<br /><a href=\"/welcome-model-view\" />/welcome-model-view</a> " +
                "<br /><a href=\"/welcome-view\" />/welcome-view</a>";
    }

    @RequestMapping(value="/welcome")   // url route endpoint
    @ResponseBody
    public String welcome() {
        return "Welcome to basic Spring MVC, WITHOUT a view.";
    }
}
