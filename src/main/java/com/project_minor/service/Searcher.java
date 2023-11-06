package com.project_minor.service;
import com.project_minor.model.Hostel;
import java.util.ArrayList;

public class Searcher {

    public static int lowBinarySearch(ArrayList<Hostel> list, int first, int last, int key) {
        int mid = first + (last - first) / 2;
        if (last > first) {
            if (list.get(mid).getPrice() == key) {
                return mid;
            }
            if (list.get(mid).getPrice() > key) {
                return lowBinarySearch(list, first, mid - 1, key);
            } else {
                return lowBinarySearch(list, mid + 1, last, key);
            }
        }
        else if(last <= first){
            if(list.get(mid).getPrice() == key){
                return mid;
            }
            if(list.get(mid).getPrice() < key){
                return mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int upBinarySearch(ArrayList<Hostel> list, int first, int last, int key) {
        int mid = first + (last - first) / 2;
        if (last > first) {
            if (list.get(mid).getPrice() == key) {
                return mid;
            }
            if (list.get(mid).getPrice() > key) {
                return upBinarySearch(list, first, mid - 1, key);
            } else {
                return upBinarySearch(list, mid + 1, last, key);
            }
        }
        else if(last <= first){
            if(list.get(mid).getPrice() == key){
                return mid;
            }
            if(list.get(mid).getPrice() < key){
                return mid;
            }
            else{
                return mid - 1;
            }
        }
        return -1;
    }
    public static ArrayList<Hostel> searchResult(ArrayList<Hostel> list, int upkey, int loKey){

        int num1 = lowBinarySearch(list,0, list.size()-1, loKey);
        int num2 = upBinarySearch(list,0, list.size()-1, upkey);
        ArrayList<Hostel> temp = new ArrayList<>();
        for (int i = num1; i <= num2; i++){
            temp.add(list.get(i));
        }
        return temp;
    }




}
