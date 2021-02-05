package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    Lecture(){

    }
    private List<Student> studentList = new ArrayList<>();

    public void enter(Student studentObject){
        this.studentList.add(studentObject);

    }
    public List<Student> getter(){
        return studentList;
    }
    public Double getHighestAverageGrade(){
        double highest = 0.0;
        for(Student student: this.studentList ){
            if(student.getAverageGrade()>highest)
                highest = student.getAverageGrade();
        }
        return highest;
    }

}
