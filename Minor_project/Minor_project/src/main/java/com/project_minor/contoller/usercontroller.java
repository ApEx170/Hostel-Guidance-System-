package com.project_minor.contoller;

import com.project_minor.model.Hostel;
import com.project_minor.service.queryHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class usercontroller {

    @GetMapping("/bhidoli")
    public ArrayList<Hostel> getHomePage(){
        return queryHandler.queryResult() ;
    }

//    @PostMapping("/bidoli")
//    public ArrayList<Hostel> postHomePage(){
//        return queryHandler.getquery() ;
//    }


//  @GetMapping("/bhidoli")
//    public ArrayList<Hostel> getHomePage(){
//        return queryHandler.getquery() ;
//    }







}



