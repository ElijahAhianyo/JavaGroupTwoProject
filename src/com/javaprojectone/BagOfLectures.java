package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures implements Bag{
    private List<Bag> LectureBagList = new ArrayList<>();
    public void add(Bag bag){
        LectureBagList.add(bag);
    }

    public void remove(Bag bag){
        LectureBagList.remove(bag);
    }

    public void clear(Bag bag){
        LectureBagList.clear();
    }
}
