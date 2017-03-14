package com.tomashchuk.Dao;

import com.tomashchuk.Entities.Lecture;

/**
 * Created by Вадим on 13.03.2017.
 */
public interface LecturesDao {
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);
}
