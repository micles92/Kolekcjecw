package com.collections.micles92;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Bolesław on 2015-11-21.
 */

    class Student implements Comparable{

    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno,String studentname ,int studentage){
        this.studentname = studentname;
        this.rollno = rollno;
        this.studentage = studentage;
    }
    public String getStudentName(){
        return studentname;
    }

    public void setStudentname(String studentname){
        this.studentname = studentname;
    }

    public int getRollno(){
        return rollno;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
    }

    public int getStudentage(){
        return studentage;
    }

    public void setStudentage(int studentage){
        this.studentage = studentage;
    }

    public String toString(){
        return studentname + ", " + rollno + ", " + studentage;
    }



    /* int compareTo(Student comparestu) {
        int compareage = ((Student)comparestu).getStudentage();
        /* For Ascending order */
        return this.studentage-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }


    @Override
    public int compareTo(Student comparestu) {
        int compareage = ((Student)comparestu).getStudentage();
        /* For Ascending order */
        return this.studentage-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
}

public class ObjSort {
    public static void main(String[] args) {

        ArrayList<Student> arraylist = new ArrayList<Student>();

        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));


        Collections.sort(arraylist);

        for (Student str : arraylist) {
            System.out.println(str);
        }
    }
}
