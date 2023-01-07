package com.oop.library;

import java.util.Date;

/**
 * Rent implements a rent of an Item for a delimited time frame
 */
public class Rent {
    Item item;
    Student student;
    Date begin;
    Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getBegin() {
        return begin;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Rent[" +
                "item = " + item +
                ", student = " + student +
                ", begin = " + begin +
                ", end = " + end +
                ']';
    }
}
