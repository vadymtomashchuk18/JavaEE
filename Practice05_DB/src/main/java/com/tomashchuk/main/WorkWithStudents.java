package com.tomashchuk.main;

import com.tomashchuk.dao.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Вадим on 12.03.2017.
 */
public class WorkWithStudents {

    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentsToDb(Student student){
        if((student!=null) && (student.getPib()!=null) && (!"".equals(student.getPib())) && (student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved: "+student);
        }
    }

    public void getFromDb(int id){
        studentsDao.getStudentById(id);
        System.out.println("Getting student: id:"+id+", "+studentsDao.getStudentById(id).getPib() + ", course "+ studentsDao.getStudentById(id).getCourse());
    }
}
