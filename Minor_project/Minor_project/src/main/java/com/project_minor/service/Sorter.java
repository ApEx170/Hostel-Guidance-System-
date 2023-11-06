package com.project_minor.service;

import com.project_minor.model.Hostel;

import java.util.ArrayList;


//Method for sorter class provides different sorting algorithms for sorting tasks
//sorting algorithms Provides option to sort two different sets of values: 1. Distance &  2. price
//with an  extra input to function
public class Sorter {
    public Sorter(String a) {
        this.a = a;
    }

    private String a;

    public void mergeSort(ArrayList<Hostel> list, int beg, int fin) {
        if (beg + 1 < fin) {
            int mid = (beg + fin) / 2;
            mergeSort(list, beg, mid);
            mergeSort(list, mid, fin);
            Merge(list, beg, mid, fin);
        }
    }

    private void Merge(ArrayList<Hostel> list, int beg, int mid, int fin) {
        ArrayList<Hostel> left = new ArrayList<>(list.subList(beg, mid));
        ArrayList<Hostel> right = new ArrayList<>(list.subList(mid, fin));

        int i = 0;
        int j = 0;
        int k = beg;

        switch (this.a){
            case "Price":
                while (i < left.size() && j < right.size()) {
                    if (left.get(i).getPrice() <= right.get(j).getPrice()) {
                        list.set(k, left.get(i));
                        i++;
                    }
                    else {
                        list.set(k, right.get(j));
                        j++;
                    }
                    k++;
                }

            case "Distance":
                while (i < left.size() && j < right.size()) {
                    if (left.get(i).getDistance() <= right.get(j).getDistance()) {
                        list.set(k, left.get(i));
                        i++;
                    }
                    else {
                        list.set(k, right.get(j));
                        j++;
                    }
                    k++;
                }
        }
            while (i < left.size()) {
                list.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {
                list.set(k, right.get(j));
                j++;
                k++;
            }

        }




}



