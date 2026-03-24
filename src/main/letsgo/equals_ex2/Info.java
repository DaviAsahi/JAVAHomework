package main.letsgo.equals_ex2;

import java.util.Objects;

//학번, 이름, 학년 순입니다.
public class Info {
    private int InfoNumber;
    private String InfoName;
    private int InfoGrade;

    public Info(int infoNumber, String infoName, int infoGrade) {
        this.InfoNumber = infoNumber;
        this.InfoName = infoName;
        this.InfoGrade = infoGrade;
    }

    public int getInfoNumber() {
        return InfoNumber;
    }

    public void setInfoNumber(int infoNumber) {
        this.InfoNumber = infoNumber;
    }

    public String getInfoName() {
        return InfoName;
    }

    public void setInfoName(String infoName) {
        this.InfoName = infoName;
    }

    public int getInfoGrade() {
        return InfoGrade;
    }

    public void setInfoGrade(int infoGrade) {
        this.InfoGrade = infoGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return InfoNumber == info.InfoNumber && InfoGrade == info.InfoGrade && Objects.equals(InfoName, info.InfoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(InfoNumber, InfoName, InfoGrade);
    }
}
