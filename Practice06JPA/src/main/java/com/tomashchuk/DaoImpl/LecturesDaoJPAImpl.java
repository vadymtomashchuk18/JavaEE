package com.tomashchuk.DaoImpl;

import com.tomashchuk.Dao.LecturesDao;
import com.tomashchuk.main.Lecture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Вадим on 13.03.2017.
 */
@Repository
@Transactional
public class LecturesDaoJPAImpl implements LecturesDao {
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class, id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
        System.out.println(lecture);
    }
}
