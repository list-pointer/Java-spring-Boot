package com.example.mvctestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    infotablerepo repo;
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
    public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2")int j)
    {
        ModelAndView modelAndView=new ModelAndView("result");
//        modelAndView.setViewName("result");
        int sum=i+j;
        modelAndView.addObject("sum",sum);
        return modelAndView;
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute infotable i)
    {
//        ModelAndView modelAndView=new ModelAndView("result");
////        modelAndView.setViewName("result");
//        int sum=i+j;
//        modelAndView.addObject("sum",sum);
//        return modelAndView;
//        repo.save(i);
        repo.save(i);
        return "result";
    }

    @GetMapping("/getAliens")
    public String getAliens(Model model)
    {
//        List<Alien> aliens= Arrays.asList(new Alien("101","Abhishek"),new Alien("102","Rahul"));
        model.addAttribute("infotable",repo.findAll());
        return "showAliens";
    }


    @RequestMapping("/getAlien")
    public String getAlien(@RequestParam("id")int id, Model model)
    {
//        List<Alien> aliens= Arrays.asList(new Alien("101","Abhishek"),new Alien("102","Rahul"));
        model.addAttribute("infotable",repo.getOne(id));
        return "showAliens";
    }

//    @RequestMapping("/getAlienByName")
//    public String getAlienByName(@RequestParam("uname")String uname, Model model)
//    {
////        List<Alien> aliens= Arrays.asList(new Alien("101","Abhishek"),new Alien("102","Rahul"));
//        model.addAttribute("infotable",repo.findByUname(uname));
//        return "showAliens";
//    }

    //Query Annotation
    @RequestMapping("/getAlienByName")
    public String getAlienByName(@RequestParam("uname")String uname, Model model)
    {
//        List<Alien> aliens= Arrays.asList(new Alien("101","Abhishek"),new Alien("102","Rahul"));
        model.addAttribute("infotable",repo.find(uname));
        return "showAliens";
    }

}
