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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (course != student.course) return false;
        return pib != null ? pib.equals(student.pib) : student.pib == null;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (pib != null ? pib.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString (){
        return studentId + ", " + pib + " , course: " + course;
    }

}
