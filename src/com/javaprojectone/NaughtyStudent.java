package com.javaprojectone;

import java.util.List;

public class NaughtyStudent extends Student{


    NaughtyStudent(List<Double> StudentGradeList, String name) {
        super(StudentGradeList, name); // new Student(StudentGradeList)
    }

    @Override
    public double getAverageGrade(){
        double averageGrade= super.getAverageGrade();
        return  averageGrade + (averageGrade/100) * 10;

    }
}
