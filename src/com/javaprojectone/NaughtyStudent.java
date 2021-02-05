package com.javaprojectone;

import java.util.List;

public class NaughtyStudent extends Student{


    NaughtyStudent(List<Double> StudentGradeList, String name, Level studentLevel) {
        super(StudentGradeList, name,studentLevel); // new Student(StudentGradeList)
    }

    @Override
    public double getAverageGrade(){
        double averageGrade= super.getAverageGrade();
        return  averageGrade + (averageGrade/100) * 10;

    }
}
