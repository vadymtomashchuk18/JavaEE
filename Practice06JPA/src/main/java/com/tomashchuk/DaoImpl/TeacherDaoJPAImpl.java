package com.tomashchuk.DaoImpl;

import com.tomashchuk.Dao.TeachersDao;
import com.tomashchuk.Entities.Teacher;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Вадим on 01.04.2017.
 */
@Repository
public class TeacherDaoJPAImpl implements TeachersDao {
    @PersistenceContext
    private EntityManager em;


    public Teacher saveTeacher(Teacher teacher) {
        return em.merge(teacher);
    }

    public Teacher getTeacherById(int id) {
        return em.find(Teacher.class,id);
    }
}
