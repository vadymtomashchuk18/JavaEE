package com.tomashchuk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        /*
        WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");

        Student testStudent = new Student("Petka Stalin",5);
        worker.saveStudentsToDb(testStudent);
        worker.getFromDb(1);
*/

        WorkWithTeacher teacherWorker = (WorkWithTeacher) context.getBean("teacherWorker");
        System.out.println(teacherWorker.getTeacherById(1));
        /*
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = teacherWorker.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        teacherWorker.saveTeacher(teacher);
*/

    }
}
