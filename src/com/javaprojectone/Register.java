package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Namable> studentNamableList = new ArrayList<>();
    Register(List<Namable> studentNamableList){
            this.studentNamableList = studentNamableList;
    }

    public List<String> getRegister(){
        List<String> studentNameList = new ArrayList<>();
        for(Namable namable : studentNamableList){
            studentNameList.add(namable.getName());
        }
        return studentNameList;
    }
}
