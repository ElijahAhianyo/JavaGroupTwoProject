package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents implements Bag {
    private List<Bag> studentBagList = new ArrayList<>();
    public void add(Bag bag){
        studentBagList.add(bag);
    }

    public void remove(Bag bag){
        studentBagList.remove(bag);
    }

    public void clear(Bag bag){
        studentBagList.clear();
    }

}
