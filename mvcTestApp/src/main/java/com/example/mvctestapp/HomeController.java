package com.example.mvctestapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
//        System.out.println("Requested");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1")int i,@RequestParam("num2")int j, HttpSession session)
//    {
////        int i=Integer.parseInt(request.getParameter("num1"));
////        int j=Integer.parseInt(request.getParameter("num2"));
//        int sum=i+j;
////        HttpSession session=request.getSession();
//        session.setAttribute("sum",sum);
//        return "result.jsp";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j)
    {
        ModelAndView modelAndView=new ModelAndView("result");
//        modelAndView.setViewName("result");
        int sum=i+j;
        modelAndView.addObject("sum",sum);
        return modelAndView;
    }

    @GetMapping("/getAliens")
    public String getAliens(Model model)
    {
        List<Alien> aliens= Arrays.asList(new Alien("101","Abhishek"),new Alien("102","Rahul"));
        model.addAttribute("aliens",aliens);
        return "showAliens";
    }

}
