package main.letsgo.chap11.Rehomework;

public class StudentsMain {
    public static void main(String[] args) {
        Students student1 = new Students(202208025, "정찬우", 2);
        System.out.println(student1.getHakbun());
        System.out.println(student1.getGrade());
        System.out.println(student1.getName());
        System.out.println(student1.toString());
        System.out.println(student1);


    }
}
