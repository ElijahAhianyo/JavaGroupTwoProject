package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Register {
    private List<Student> studentRegisterList = new ArrayList<>();
    Register(List<Student> studentRegisterList){
            this.studentRegisterList = studentRegisterList;
    }

    public List<String> getRegister(){
        List<String> studentNameList = new ArrayList<>();
        for(Student student : studentRegisterList){
            studentNameList.add(student.getName());
        }
        return studentNameList;
    }
    public List<String> getRegisterByLevel(Level studentLevel){
        List<String>  studentNamesByLevelList= new ArrayList<>();
        for(Student student : studentRegisterList){
            if(student.getLevel() == studentLevel){
                studentNamesByLevelList.add(student.getName());
            }
        }
        return studentNamesByLevelList;
    }

    public List<String> printReport(){
        M
    }

}
