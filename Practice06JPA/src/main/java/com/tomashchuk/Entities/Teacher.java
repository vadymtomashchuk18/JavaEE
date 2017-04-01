package com.tomashchuk.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Вадим on 01.04.2017.
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
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="cell_phone")
    private String cellphone;

    public Date getBirthDate() {
        return birthDate;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
