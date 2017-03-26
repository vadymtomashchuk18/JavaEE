package com.tomashchuk.dao;

import com.tomashchuk.main.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /*
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
*/
    public Teacher getTeacherById(int id) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery(
                "find teacher by id");
        query.setParameter("id", id);
        return (Teacher) query.list().get(0);
    }
    public void saveTeacher(Teacher teacher) {
        currentSession().update(teacher);
    }

    public List<Teacher> getTeacherByName(String name) {
        Query query = sessionFactory.getCurrentSession().
                createQuery("from Teacher t where firstname=:name ");
        query.setParameter("name", name);
        List <Teacher> t = (List<Teacher>) query.list();
        return t;
    }
}





