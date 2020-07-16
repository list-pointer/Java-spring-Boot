package com.example.mvctestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class ApiController {
    @Autowired
    infotablerepo infotablerepo;

    @GetMapping("/Aliens")
    public List<infotable> getAliens() {
        List<infotable> infotableList = infotablerepo.findAll();
        return infotableList;
    }
}
