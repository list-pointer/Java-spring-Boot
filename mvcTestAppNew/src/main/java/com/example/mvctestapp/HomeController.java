package com.example.mvctestapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
//        System.out.println("Requested");
        return "index.jsp";
    }

}
