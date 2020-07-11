package com.example.mvctestapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class infotable {
    @Id
    private int id;
    private String uname;

    public infotable(){}

//    infotable(int id,String uname)
//    {
//        super();
//        this.id=id;
//        this.uname=uname;
//    }


    public int getId() {
        return id;
    }

    public String getName() {
        return uname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String uname) {
        this.uname = uname;
    }

    public String toString()
    {
        return "Alien [ID= "+id+" , name ="+uname+" ]";
    }
}
