package com.tomashchuk.Entities;

import com.tomashchuk.Dao.LecturesDao;
import com.tomashchuk.Dao.TeachersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by Вадим on 01.04.2017.
 */
public class Worker {
    @Autowired
    private PlatformTransactionManager txManager;
    @Autowired
    LecturesDao lecturesDao;
    @Autowired
    TeachersDao teachersDao;


    public void saveLecture(Lecture lecture){
        lecturesDao.saveLecture(lecture);
    }



    public Teacher saveTeacher(final Teacher teacher){
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("teacherTransactions");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            teachersDao.saveTeacher(teacher);
            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
        }
        return teacher;
    }

    public Teacher getTeacher(int id) {
        return teachersDao.getTeacherById(id);
    }


    public Lecture getLecture(int id) {
        return lecturesDao.getLecture(id);
    }


}
