package com.tomashchuk.dao;

import com.tomashchuk.main.Teacher;

/**
 * Created by Вадим on 12.03.2017.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
