package main.letsgo.equals_ex2;

import main.letsgo.equals_ex2.Info;

public class EqualsExProblem {
    public static void main(String[] args) {
        Info info1 = new Info(202208025, "정찬우", 2);
        Info info2 = new Info(202208025, "정찬우", 2);
        //Info info3 = new Info(202608035, "사쿠라 미코", 1);

        if(info1.equals(info2)) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }

    }
}
