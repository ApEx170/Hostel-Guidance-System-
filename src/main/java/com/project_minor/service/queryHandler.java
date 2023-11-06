package com.project_minor.service;

import com.project_minor.DAO.con_file;
import com.project_minor.model.Hostel;
import com.project_minor.service.Sorter;

import java.util.ArrayList;

public  class queryHandler {

    public static ArrayList<Hostel> queryResult(){

//        Sorter sort  = new Sorter("Distance");
        Sorter sort  = new Sorter("Price");


      ArrayList<Hostel> list = con_file.getHostelInfo();
      sort.mergeSort(list,0,list.size() -1);
        return list;

    }



}




