package com.javaprojectone;

import java.util.Comparator;
/*
* This comparator sorts by level
*
* */
public class StudentLevelComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getLevel().compareTo(secondStudent.getLevel());
    }
}
