package com.javaprojectone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Double> studentGrades = new ArrayList<Double>(Arrays.asList(20.3,45.6,70.9));
        Student student = new Student(studentGrades, "Justice", Level.LEVEL100);

        NaughtyStudent naughtyStudent = new NaughtyStudent(studentGrades, "Justice", Level.LEVEL100);


        ArrayList<Double> SecondStudentGrades = new ArrayList<Double>(Arrays.asList(98.2,50.5,53.9));
        Student studentObject = new Student(studentGrades, "Nafiu",Level.LEVEL200);
        Student secondStudent = new Student(SecondStudentGrades, "Kwabena",Level.LEVEL200);
        Lecture lecture = new Lecture();
        lecture.enter(studentObject);
        lecture.enter(secondStudent);
        System.out.println(student.getAverageGrade());
        System.out.println(naughtyStudent.getAverageGrade());
        for (Enum level: Level.values())
            System.out.println(level);
//        System.out.println(Level.values().toString());
    }
}