package main.letsgo.tostring_ex1;

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
    public String toString() {
        return "Info(" +
                "InfoNumber=" + InfoNumber +
                ", InfoName='" + InfoName + '\'' +
                ", InfoGrade=" + InfoGrade +
                ')';
    }
}
