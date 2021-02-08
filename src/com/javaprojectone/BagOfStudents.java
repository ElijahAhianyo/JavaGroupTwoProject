package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents<T> implements Bag<T> {
    private List<T> t = new ArrayList<>();
    public void add(T t){
        this.t.add(t);
    }

    public void remove(T t){
        this.t.remove(t);
    }

    public void clear(){
        this.t.clear();
    }

}
