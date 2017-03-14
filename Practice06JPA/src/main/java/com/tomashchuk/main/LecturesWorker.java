package com.tomashchuk.main;

import com.tomashchuk.Dao.LecturesDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Вадим on 13.03.2017.
 */
public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}
