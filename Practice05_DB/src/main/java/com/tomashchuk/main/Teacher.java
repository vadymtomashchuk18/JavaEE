package com.tomashchuk.main;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Вадим on 12.03.2017.
 */
@Entity
@Table(name="TEACHERS")
@NamedQuery(query = "Select t from Teacher t where t.teacherId = :id",
        name = "find teacher by id")
public class Teacher {
    @Id
    @GeneratedValue
    private int teacherId;

    @Column(name="firstname")
    private  String firstname;

    @Column(name="lastname")
    private  String lastname;

    @Column(name="birth_date")
    private Date birthDate;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Column(name="cell_phone")
    private  String cellphone;

    @Override
    public String toString(){
        return "id:" + teacherId +
                ", firstname: " + firstname +
                ", lastname: " + lastname +
                ", birth date: " + birthDate +
                ", cell phone: " + cellphone;
    }
}
