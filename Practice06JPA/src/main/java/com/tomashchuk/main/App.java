package com.tomashchuk.main;

import com.tomashchuk.Entities.Lecture;
import com.tomashchuk.Entities.Teacher;
import com.tomashchuk.Entities.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Lecture lecture = new Lecture();
/*        lecture.setName("Logical programming");
        lecture.setCredits(3.5);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);
*/
        Worker worker = (Worker)context.getBean("worker");
        Teacher teacher = worker.getTeacher(1);
        teacher.setFirstname("Koresh");
        worker.saveTeacher(teacher);
        Lecture l = worker.getLecture(1);
        l.setName("Kkarina");
        worker.saveLecture(l);
    }
}
