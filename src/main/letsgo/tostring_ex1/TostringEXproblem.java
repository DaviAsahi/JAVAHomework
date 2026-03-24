package main.letsgo.tostring_ex1;

public class TostringEXproblem {
    public static void main(String[] args) {
        Info info1 = new Info(202208025, "정찬우", 2);
        System.out.println(info1.getInfoNumber());
        System.out.println(info1.getInfoName());
        System.out.println(info1.getInfoGrade());
        System.out.println(info1.toString());
        System.out.println(info1);
    }
}
