package com.tomashchuk.main;

/**
 * Created by Вадим on 12.03.2017.
 */
public class Student {

    private int studentId;
    private String pib;
    private int course;

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString (){
        return studentId + ", " + pib + " , course: " + course;
    }

}
