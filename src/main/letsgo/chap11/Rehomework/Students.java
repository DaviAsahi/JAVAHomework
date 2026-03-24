package main.letsgo.chap11.Rehomework;

import java.util.Objects;

public class Students {
    private int hakbun;
    private String name;
    private int grade;

    public Students(int hakbun, String name, int grade) {
        this.hakbun = hakbun;
        this.name = name;
        this.grade = grade;
    }

    public int getHakbun() {
        return hakbun;
    }

    public void setHakbun() {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return hakbun == students.hakbun && grade == students.grade && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hakbun, name, grade);
    }
}


