package com.tomashchuk.main;

/**
 * Created by Вадим on 13.03.2017.
 */
import javax.persistence.*;

@Entity
@Table(name="Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private double credits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public String toString(){
        return "id:" + id + ", name: " + name + ", credits: " + credits;
    }

}


