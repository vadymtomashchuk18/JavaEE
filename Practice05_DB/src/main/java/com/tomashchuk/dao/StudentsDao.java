package com.tomashchuk.dao;

import com.tomashchuk.main.Student;

/**
 * Created by Вадим on 12.03.2017.
 */
public interface StudentsDao {
    void addStudent(Student student);
    public Student getStudentById(int id);
}
