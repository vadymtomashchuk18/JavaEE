package com.tomashchuk.main;

import com.tomashchuk.dao.TeachersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Вадим on 12.03.2017.
 */
@Transactional
public class WorkWithTeacher {

    @Autowired
    private TeachersDao teachersDao;

    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Added teacher: " + teacher);
        return teacher;
    }

    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }

    public void saveTeacher(Teacher teacher){
        teachersDao.saveTeacher(teacher);
        System.out.println("Saved teacher: "+teacher);
    }

    public List<Teacher> getTeacherByName(String name){
        return teachersDao.getTeacherByName(name);
    }
}
