package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class Student implements Namable {
//    ArrayList<Double> TestArray= new ArrayList<Double> ([]);
    private Level level;
    private List<Double> studentGradeList = new ArrayList<Double>();
    private String studentName;

    Student(List<Double> StudentGradeList, String studentName, Level level){
        this.studentGradeList = StudentGradeList;
        this.studentName = studentName;
        this.level = level;

    }


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

    public Level getLevel(){
        return this.level;
    }
}
