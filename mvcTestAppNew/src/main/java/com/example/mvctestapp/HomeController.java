package com.example.mvctestapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
//        System.out.println("Requested");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1")int i,@RequestParam("num2")int j, HttpSession session)
    {
//        int i=Integer.parseInt(request.getParameter("num1"));
//        int j=Integer.parseInt(request.getParameter("num2"));
        int sum=i+j;
//        HttpSession session=request.getSession();
        session.setAttribute("sum",sum);
        return "result.jsp";
    }

}
