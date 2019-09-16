package org.launchcode.pathingAlgorithm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("hello", "Hello, World!");

        return "hello/index";
    }
}