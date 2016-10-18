package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by root on 18.10.16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("mess", "Hello, MVC work!");

        return "home";
    }
}
