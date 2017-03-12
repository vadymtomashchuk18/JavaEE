package com.tomashchuk.dao;

import com.tomashchuk.main.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Вадим on 12.03.2017.
 */
@Repository
public class HibernateTeacherDao implements TeachersDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }

    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }

    public void saveTeacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
