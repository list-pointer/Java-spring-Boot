package com.example.mvctestapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface infotablerepo extends JpaRepository<infotable, Integer> {
    List<infotable> findByUname(String uname);//Query DSL(Domain specific language)
}
