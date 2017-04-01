package com.tomashchuk.Dao;

import com.tomashchuk.Entities.Teacher;

/**
 * Created by Вадим on 01.04.2017.
 */
public interface TeachersDao {
    Teacher getTeacherById(int id);
    Teacher saveTeacher(Teacher teacher);
}
