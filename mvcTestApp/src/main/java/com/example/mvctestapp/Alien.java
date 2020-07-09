package com.example.mvctestapp;

public class Alien {
    private String id;
    private String name;

    Alien(String id,String name)
    {
        super();
        this.id=id;
        this.name=name;
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
        return "Alien [ID= "+id+" , name ="+name+" ]";
    }
}
