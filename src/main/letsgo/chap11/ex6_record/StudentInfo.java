package main.letsgo.chap11.ex6_record;

public record StudentInfo(int id, String name) {
    public static String SCHOOL_NAME = "INHATC";

    public void setName(String name) {
        //this.name = name;
    }
}
