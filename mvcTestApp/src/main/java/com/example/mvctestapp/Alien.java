package com.example.mvctestapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
    @Id
    private int id;
    private String uname;

    public Alien(){}

    Alien(int id,String uname)
    {
        super();
        this.id=id;
        this.uname=uname;
    }



//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String toString()
    {
        return "Alien [ID= "+id+" , name ="+uname+" ]";
    }
}
