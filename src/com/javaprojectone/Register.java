package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Namable> studentRegisterList = new ArrayList<>();
    Register(List<Namable> studentRegisterList){
            this.studentRegisterList = studentRegisterList;
    }

    public List<String> getRegister(){
        List<String> studentNameList = new ArrayList<>();
        for(Namable namable : studentRegisterList){
            studentNameList.add(namable.getName());
        }
        return studentNameList;
    }
    public List<String> getRegisterByLevel(Level studentLevel){
        List<String> studentStudyingLevelList= new ArrayList<>();
        for(Namable namable : studentRegisterList){
            if(((Student)namable).getLevel() == studentLevel){
                studentStudyingLevelList.add(namable.getName());
            }
        }
        return studentStudyingLevelList;

    }

    public String printReport(){
        String  reportString = "";

        for(Enum level: Level.values()){

        }
        return null;
    }
}
