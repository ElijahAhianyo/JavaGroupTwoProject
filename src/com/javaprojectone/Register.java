package com.javaprojectone;

import java.util.*;

public class Register {
    private List<Student> studentRegisterList = new ArrayList<>();
    Register(List<Student> studentRegisterList){
            this.studentRegisterList = studentRegisterList;
    }

    public List<String> getRegister(){
        List<String> studentNameList = new ArrayList<>();
        for(Namable namable : studentRegisterList){
            studentNameList.add(namable.getName());
        }
        return studentNameList;
    }
//    public List<String> getRegisterByLevel(Level studentLevel){
//        List<String> studentStudyingLevelList= new ArrayList<>();
//        for(Namable namable : studentRegisterList){
//            if(((Student)namable).getLevel() == studentLevel){
//                studentStudyingLevelList.add(namable.getName());
//            }
//        }
//        return studentStudyingLevelList;
//
//    }

    public Map getRegisterByLevel(Level studentLevel){
        List<String> studentStudyingLevelList= new ArrayList<>();
        Map studentMap = new HashMap();
        for(Namable namable : studentRegisterList){
            if(((Student)namable).getLevel() == studentLevel){
                studentStudyingLevelList.add(namable.getName());
            }
        }
        studentMap.put(studentLevel,studentStudyingLevelList);
        return studentMap;

    }

// answer this question
    public String printReport(){
        String  reportString = "";

        for(Enum level: Level.values()){

        }
        return null;
    }

    public List<Student> sort(Comparator<Student> studentComparator){
        Collections.sort(this.studentRegisterList,studentComparator);
        return this.studentRegisterList;
    }

    public Student getStudentByName(String studentName) throws StudentNotFoundException{
        for (Student student: this.studentRegisterList){
            if(student.getName() == studentName){
                return student;
            }
        }
        throw new StudentNotFoundException();
    }
}
