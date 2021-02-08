package com.javaprojectone;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(){
        super("student not found");
    }
    public StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }


}
