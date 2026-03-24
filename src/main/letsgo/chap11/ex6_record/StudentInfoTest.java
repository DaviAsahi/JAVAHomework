package main.letsgo.chap11.ex6_record;

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo1 = new StudentInfo(111, "홍길동");
        StudentInfo studentInfo2 = new StudentInfo(111, "홍길동");

        System.out.println(studentInfo1.equals(studentInfo2));
        System.out.println(studentInfo1.name());
        System.out.println(studentInfo2);
    }
}
