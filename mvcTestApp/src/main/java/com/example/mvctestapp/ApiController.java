package com.example.mvctestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This is only used when all the functions are rest functions
@RestController
//@ResponseBody
public class ApiController {
    @Autowired
    infotablerepo infotablerepo;

    @GetMapping("/Aliens")
    public List<infotable> getAliens() {
        List<infotable> infotableList = infotablerepo.findAll();
        return infotableList;
    }

    @GetMapping("/Alien/{id}")
    public infotable getAlien(@PathVariable("id") int id) {
        infotable info = infotablerepo.findById(id).orElse(new infotable());
        return info;
    }

    @PostMapping("Alien")
    public infotable sendAlien(infotable info) {
        infotablerepo.save(info);
        return info;
    }
}
