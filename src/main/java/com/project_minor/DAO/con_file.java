package com.project_minor.DAO;

import java.util.ArrayList;
import  com.project_minor.model.Hostel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;


public class con_file {

    public static ArrayList<Hostel> getHostelInfo(){

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("D:\\[Minor project]\\Minor_Project(GIT)\\src\\main\\resources\\static\\dummy_hostel.json"),
                    new TypeReference<ArrayList<Hostel>>() {});
//            for (Hostel hotel : hotels) {
//                System.out.println("Name: " + hotel.getName());
//                System.out.println("Distance: " + hotel.getDistance());
//                System.out.println("Price: " + hotel.getPrice());
//                System.out.println();
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
