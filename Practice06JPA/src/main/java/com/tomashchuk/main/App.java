package com.tomashchuk.main;

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
    }
}
