package com.example.mvctestapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface infotablerepo extends JpaRepository<infotable, Integer> {
//    List<infotable> findByUname(String uname);//Query DSL(Domain specific language)

    //Query for selecting
    @Query("from infotable where uname= :name")
    List<infotable> find(@Param("name") String uname);
}
