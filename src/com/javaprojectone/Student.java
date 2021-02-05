package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class Student implements Namable,HasLevel {
//    ArrayList<Double> TestArray= new ArrayList<Double> ([]);

    private List<Double> studentGradeList = new ArrayList<Double>();
    private String studentName;
    private Level studentLevel;

    Student(List<Double> StudentGradeList, String studentName, Level studentLevel){
        this.studentGradeList = StudentGradeList;
        this.studentName = studentName;
        this.studentLevel = studentLevel;
    }
//    Student(){
//
//    }

    public double getAverageGrade(){
        double sum = 0.0;
        for(int i = 0; i< this.studentGradeList.size(); i++){
            sum += this.studentGradeList.get(i);
        }
        return sum/this.studentGradeList.size();

    }

    @Override
    public String getName() {
        return this.studentName;
    }

    @Override
    public Level getLevel(){
        return this.studentLevel;
    }
}
